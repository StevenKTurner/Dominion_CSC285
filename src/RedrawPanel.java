
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


//forces player to select a certain number of cards to discard


public class RedrawPanel extends PlayerPanel {
    
    private GameManager gm;
    private View view;
    private JLabel discardLabel;
    private JPanel statsPanel;
    private JPanel handPanel;
    private ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    private JButton endButton;
    
    public RedrawPanel(View view){
        gm = view.getGameManager();
        this.view = view;
        
        
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        statsPanel = new JPanel();
        handPanel = new JPanel();

        endButton = new JButton("Finish Discard");
        endButton.addActionListener(new EndButtonListener(view));
        
        
        
        this.add(statsPanel);
        this.add(handPanel);
        this.add(endButton);
        

        
//        System.out.println("New Action Panel created");
        update();
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

        discardLabel = new JLabel(gm.getActivePlayer().getName() + ", Please discard as many cards as you like");
        
        statsPanel.add(discardLabel);
        
        populateCardButtons();  
        
        statsPanel.add(endButton);
        
        repaint();
        revalidate();
        

//        System.out.println("ActionPanel updated");
    }


    private static class EndButtonListener implements ActionListener {
        
        private View view;
        
        //Will need to switch this to take the View later on, as the End Button may need to recreate
        //The PlayerPanel itself in view as a different subclass.  Right now this is a proof of concept.
        public EndButtonListener(View view) {
            this.view = view;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                view.getGameManager().getActivePlayer().drawCards(view.getGameManager().getActivePlayer().getSpecialDrawAmount());
                view.getGameManager().getActivePlayer().playerTurn = Player.Turn.ACTION;
                view.getGameManager().getActivePlayer().setSpecialDrawAmount(0);
                view.update();
        }
    }

    private static class CardButtonListener implements ActionListener {

        private View view;
        private Card card;
        
        public CardButtonListener(View view, Card card) {
            this.view = view;
            this.card = card;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getGameManager().getActivePlayer().discard(card);
            view.getGameManager().getActivePlayer().addSpecialDrawAmount(1);
            
        if (view.getGameManager().getActivePlayer().getHand().isEmpty()){
            view.getGameManager().getActivePlayer().drawCards(view.getGameManager().getActivePlayer().getSpecialDrawAmount());
            view.getGameManager().getActivePlayer().playerTurn = Player.Turn.ACTION;
            }
        view.update();
        }
    }
    
}
