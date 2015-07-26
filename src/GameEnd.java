
import java.util.ArrayList;
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
public class GameEnd {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel playerScores;
    private String text;
    
    public GameEnd(ArrayList<String> players, ArrayList<Integer> scores){
        frame = new JFrame();
        panel = new JPanel();
        text = "The Scores: ";
        
        for (String player : players){
            text += player + ": " + scores.get(players.indexOf(player)) + ", ";
        }
        
        playerScores = new JLabel(text);
        panel.add(playerScores);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
