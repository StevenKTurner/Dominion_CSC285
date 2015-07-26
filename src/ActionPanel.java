
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ActionPanel extends PlayerPanel{
    
    private GameManager gm;
    private View view;
    private JLabel actionLabel;
    private JLabel buyLabel;
    private JLabel cashLabel;
    private JPanel statsPanel;
    private JPanel handPanel;
    private JPanel inPlayPanel;
    private ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    private JButton endButton;
    private JButton buyTurnButton;
    
    public ActionPanel(View view){
        gm = view.getGameManager();
        this.view = view;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        statsPanel = new JPanel();
        handPanel = new JPanel();
        inPlayPanel = new JPanel();

        endButton = new JButton("End Turn");
        endButton.addActionListener(new EndButtonListener(view));
        
        buyTurnButton = new JButton("Go to Buy Phase");
        buyTurnButton.addActionListener(new BuyTurnButtonListener(view));
        
        this.add(statsPanel);
        this.add(inPlayPanel);
        this.add(handPanel);
        this.add(endButton);
        this.add(buyTurnButton);
        
//        System.out.println("New Action Panel created");
        update();
    }
    
    private void populateCardButtons(){
//        System.out.println("Populating buttons");
        //clearCardButtons();
//        System.out.println(gm.getActivePlayer().getName() + "is populating Cards");
        for (Card card : gm.getActivePlayer().getHand()){
            JButton temp = new JButton(card.getImage());
            if (card.getType() != "Money" && card.getType() != "Victory Point"){
                temp.addActionListener(new CardButtonListener(view, card));
            }
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
    
    private void populateInPlay(){
        String temp = gm.getActivePlayer().getName() + " has Played: ";
        for (Card card: gm.getActivePlayer().getInPlay()){
            temp += card.getName() + ", ";
        }
        statsPanel.add(new JLabel(temp));
    }
    
    public void update(){
        clearCardButtons();
//        System.out.println("Cards cleared");
        statsPanel.removeAll();
        
        //this.removeAll();
        
        populateInPlay();

        actionLabel = new JLabel("Actions: " + gm.getActivePlayer().getActionPoints());
        buyLabel = new JLabel("Buys: " + gm.getActivePlayer().getBuys());
        cashLabel = new JLabel("Cash: " + gm.getActivePlayer().getCash());
        
        statsPanel.add(actionLabel);
        statsPanel.add(buyLabel);
        statsPanel.add(cashLabel);
        
        populateCardButtons();  
        
        statsPanel.add(endButton);
        statsPanel.add(buyTurnButton);
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
//            apanel.gm.startNextPlayerTurn();
//            apanel.update();
//            System.out.println("End Turn Button Pressed");
            if (view.getGameManager().isEndGame()){
                view.getGameManager().endGame();
            }
             view.getGameManager().startNextPlayerTurn();
             JOptionPane.showMessageDialog(null, view.getGameManager().getActivePlayer().getName() + ", Please sit down and hit OK");
             view.update();
        }
    }

    private static class BuyTurnButtonListener implements ActionListener {

        private View view;
        
        public BuyTurnButtonListener(View view) {
            this.view = view;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getGameManager().getActivePlayer().playerTurn = Player.Turn.BUYING;
            view.update();
        }
    }

    private static class CardButtonListener implements ActionListener {

        private View view;
        private Card card;
        private Action action;
        
        public CardButtonListener(View view, Card card) {
            this.view = view;
            this.action = card.getAction();
            this.card = card;
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getGameManager().getActivePlayer().getActionPoints() > 0){
                view.getGameManager().getActivePlayer().useCard(card);
                action.initialize(view);
                view.update();
                //System.out.println("Card used");
            }
        }
    }
    
        
//    public static void main(String[] args) {
//        ArrayList<String> players = new ArrayList<>();
//        players.add("Steven");
//        players.add("Neal");
//        GameManager test = new GameManager(players);
//        
//        test.getActivePlayer().useCard(test.getActivePlayer().getHand().get(2));
//        
//        
//        PlayerPanel playerPanel = new ActionPanel(new View());
//        JFrame frame = new JFrame();
//        frame.getContentPane().add(playerPanel);
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
}
