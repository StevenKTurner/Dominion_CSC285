
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


//forces player to select a certain number of cards to discard


public class RemodelPanel extends PlayerPanel {
    
    private GameManager gm;
    private View view;
    private JLabel discardLabel;
    private JPanel statsPanel;
    private JPanel handPanel;
    private ArrayList<JButton> cardButtons = new ArrayList<JButton>();

    
    public RemodelPanel(View view){
        gm = view.getGameManager();
        this.view = view;
        
        
        
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        statsPanel = new JPanel();
        handPanel = new JPanel();

        
        
        this.add(statsPanel);
        this.add(handPanel);
        
        if(gm.getActivePlayer().getHand().isEmpty()){
            gm.getActivePlayer().playerTurn = Player.Turn.ACTION;
            view.update();
        } else update();

        
//        System.out.println("New Action Panel created");
    }
    
    private void populateCardButtons(){
//        System.out.println("Populating buttons");
        //clearCardButtons();
//        System.out.println(gm.getActivePlayer().getName() + "is populating Cards");
        for (Card card : gm.getActivePlayer().getHand()){
            JButton temp = new JButton(card.getImage());
            temp.addActionListener(new CardButtonListener(view, card));
            cardButtons.add(temp);
            handPanel.add(cardButtons.get(cardButtons.size()-1));
//            System.out.println(card);
        }
//        System.out.println("Cards Populated: " + cardButtons.size());
    }
    
    private void clearCardButtons(){
//        System.out.println("Clearing Buttons");
        for (int i = cardButtons.size()-1; i >= 0; i--){
            handPanel.remove(cardButtons.get(i));
        }
        cardButtons.clear();
//        System.out.println("Buttons left: " + cardButtons.size());
    }
    
//    private void populateInPlay(){
//        String temp = gm.getActivePlayer().getName() + " has Played: ";
//        for (Card card: gm.getActivePlayer().getInPlay()){
//            temp += card.getName() + ", ";
//        }
//        statsPanel.add(new JLabel(temp));
//    }
    
    public void update(){
        clearCardButtons();
//        System.out.println("Cards cleared");
        statsPanel.removeAll();
        
        //this.removeAll();

        discardLabel = new JLabel(gm.getActivePlayer().getName() + ", Please choose a card to trash");
        
        statsPanel.add(discardLabel);
        
        populateCardButtons();  
        
        repaint();
        revalidate();
//        System.out.println("ActionPanel updated");
    }

    private static class CardButtonListener implements ActionListener {

        private View view;
        private Card card;
        private ArrayList<Card> source;
        
        public CardButtonListener(View view, Card card) {
            this.view = view;
            this.card = card;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getGameManager().getActivePlayer().setFreebieValue(card.getCost() + 2);
            view.getGameManager().getActivePlayer().trashCard(card, view.getGameManager().getActivePlayer().getHand());
            view.getGameManager().getActivePlayer().playerTurn = Player.Turn.FREEBIE;
            view.update();
        }
    }

    
}
