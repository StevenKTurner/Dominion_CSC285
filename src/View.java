
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
    JFrame frame;
    
    public View(){
        
        //Need to start up the Start Game Screen here to get the player names and amout of players and pass that in
        //to a newly created GameManager as an ArrayList<String>
        
        //Temporary testing code below:
//        ArrayList<String> temp = new ArrayList();
//        temp.add("Steven");
//        temp.add("Neal");
//        temp.add("Kelly");
//        temp.add("Zach");
//        gm = new GameManager(temp);
    }
    
    public void GameStart(ArrayList<String> players){
        gm = new GameManager(players);
        mainPanel = new JPanel(new GridBagLayout());
        ppanel = new ActionPanel(this);
        spanel = new StorePanelBlank(gm.getStore());
        
        mainPanel.add(ppanel);
        mainPanel.add(spanel);
        
        frame = new JFrame();
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public GameManager getGameManager(){
        return gm;
    }
    
    public void update(){
        mainPanel.removeAll();   
//        if (gm.isEndGame()){
//            //do the endgame screen
//        } else 
            if (gm.getActivePlayer().isDiscardInEffect()){
            ppanel = new DiscardPanel(this);
            //spanel = whatever the "Can't buy anything" model of the store panel is
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.BUYING){
            ppanel = new PlayerBuyPanel(this);
            spanel = new StorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.ACTION){
            ppanel = new ActionPanel(this);
            //spanel = whatever the "can't buy anything" model of the store panel is
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.DISCARDING){
            ppanel = new DiscardPanel(this);
            //spanel = whatever the "can't buy anything" model of teh store panel is
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.FREEBIE){
            ppanel = new FreebiePanel(this);
            //spanel = whatever the store version of freebie panel is
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.TRASHING){
            ppanel = new TrashPanel(this);
            //spanel = whatever the "can't buy anything" model of the store panel is
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.MINING){
            
        }
            
        mainPanel.add(ppanel);
        mainPanel.add(spanel);
        ppanel.repaint();
        ppanel.revalidate();
        mainPanel.repaint();
        mainPanel.revalidate();
        frame.repaint();
        frame.revalidate();
        //spanel.update();
    }
    
    public static void main(String[] args) {
        View testview = new View();
        ArrayList<String> temp = new ArrayList();
        temp.add("Steven");
        temp.add("Neal");
        temp.add("Kelly");
        temp.add("Zach");
        testview.GameStart(temp);
    }
    
    
    
    
    
}
