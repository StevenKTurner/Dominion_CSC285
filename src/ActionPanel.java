
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    
    public ActionPanel(View view){
        gm = view.getGameManager();
        this.view = view;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        statsPanel = new JPanel();
        handPanel = new JPanel();
        inPlayPanel = new JPanel();

        endButton = new JButton("End Turn");
        endButton.addActionListener(new EndButtonListener(this));
        
        this.add(statsPanel);
        this.add(inPlayPanel);
        this.add(handPanel);
        this.add(endButton);
        
        update();
    }
    
    private void populateCardButtons(){
//        System.out.println("Populating buttons");
        //clearCardButtons();
        for (Card card : gm.getActivePlayer().getHand()){
            cardButtons.add(new JButton(card.getImage()));
            handPanel.add(cardButtons.get(cardButtons.size()-1));
        }
//        System.out.println("Buttons Populated: " + cardButtons.size());
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
        revalidate();
    }

    private static class EndButtonListener implements ActionListener {
        
        private ActionPanel apanel;
        
        //Will need to switch this to take the View later on, as the End Button may need to recreate
        //The PlayerPanel itself in view as a different subclass.  Right now this is a proof of concept.
        public EndButtonListener(ActionPanel apanel) {
            this.apanel = apanel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            apanel.gm.startNextPlayerTurn();
            apanel.update();
        }
    }
    
        
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Steven");
        players.add("Neal");
        GameManager test = new GameManager(players);
        
        test.getActivePlayer().useCard(test.getActivePlayer().getHand().get(2));
        
        
        PlayerPanel playerPanel = new ActionPanel(new View());
        JFrame frame = new JFrame();
        frame.getContentPane().add(playerPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
