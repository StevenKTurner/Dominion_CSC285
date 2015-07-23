
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class PlayerPanel extends JPanel{
    
    GameManager gm;
    JLabel actionLabel;
    JLabel buyLabel;
    JLabel cashLabel;
    ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    
    public PlayerPanel(GameManager gameManager){
        gm = gameManager;
        update();
    }
    
    private void populateCardButtons(){
//        System.out.println("Populating buttons");
        //clearCardButtons();
        for (Card card : gm.getActivePlayer().getHand()){
            cardButtons.add(new JButton(card.getImage()));
            this.add(cardButtons.get(cardButtons.size()-1));
        }
//        System.out.println("Buttons Populated: " + cardButtons.size());
    }
    
    private void clearCardButtons(){
//        System.out.println("Clearing Buttons");
        for (int i = cardButtons.size()-1; i >= 0; i--){
            this.remove(cardButtons.get(i));
        }
        cardButtons.clear();
//        System.out.println("Buttons left: " + cardButtons.size());
    }
    
    public void update(){
        clearCardButtons();
        this.removeAll();

        actionLabel = new JLabel("Actions: " + gm.getActivePlayer().getActionPoints());
        buyLabel = new JLabel("Buys: " + gm.getActivePlayer().getBuys());
        cashLabel = new JLabel("Cash: " + gm.getActivePlayer().getCash());
        
        this.add(actionLabel);
        this.add(buyLabel);
        this.add(cashLabel);
        
        populateCardButtons();  
    }
    
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Steven");
        players.add("Neal");
        GameManager test = new GameManager(players);
        test.getActivePlayer().beginTurn();
        
        
        PlayerPanel playerPanel = new PlayerPanel(test);
        JFrame frame = new JFrame();
        frame.getContentPane().add(playerPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
