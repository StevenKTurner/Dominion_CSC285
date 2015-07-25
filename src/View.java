
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
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
public class View {
    GameManager gm;
    StorePanelBlank spanel;
    PlayerPanel ppanel;
    JPanel mainPanel;
    
    public View(){
        
        //Need to start up the Start Game Screen here to get the player names and amout of players and pass that in
        //to a newly created GameManager as an ArrayList<String>
        
        //Temporary testing code below:
        ArrayList<String> temp = new ArrayList();
        temp.add("Steven");
        temp.add("Neal");
        temp.add("Kelly");
        temp.add("Zach");
        gm = new GameManager(temp);
    }
    
    public void GameStart(ArrayList<String> players){
        gm = new GameManager(players);
        mainPanel = new JPanel(new GridBagLayout());
        ppanel = new ActionPanel(this);
        spanel = new StorePanelBlank(gm.getStore());
        
        mainPanel.add(ppanel);
        mainPanel.add(spanel);
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(mainPanel);
    }
    
    public GameManager getGameManager(){
        return gm;
    }
    
    
    
    
    
}
