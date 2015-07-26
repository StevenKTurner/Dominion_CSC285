
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
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
public class View {
    GameManager gm;
    StorePanel spanel;
    PlayerPanel ppanel;
    JPanel mainPanel;
    JScrollPane scroll;
    JFrame frame;
    
    public View(ArrayList<String> players){
        GameStart(players);
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
 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        ppanel = new ActionPanel(this);
        spanel = new InactiveStorePanel(this);
        
        mainPanel.add(spanel);
        mainPanel.add(ppanel);
        
        scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        frame = new JFrame();
        frame.getContentPane().add(scroll);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public GameManager getGameManager(){
        return gm;
    }
    
    public void update(){
        //scroll.removeAll();
        mainPanel.removeAll();  
        ppanel.removeAll();
        spanel.removeAll();
        if (gm.isEndGame()){
            //do the endgame screen
            gm.endGame();
            ArrayList<String> playerNames = new ArrayList();
            ArrayList<Integer> scores = new ArrayList();
            for (Player player : gm.getPlayers()){
                playerNames.add(player.getName());
            }
            for (int score : gm.scores){
                scores.add(score);
            }
            GameEnd end = new GameEnd(playerNames, scores);
            this.frame.setVisible(false);
            this.frame.dispose();
        } else if (gm.getActivePlayer().isDiscardInEffect()){
            ppanel = new DiscardPanel(this);
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.BUYING){
            ppanel = new InactivePanel(this);
            spanel = new BuyStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.ACTION){
            ppanel = new ActionPanel(this);
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.DISCARDING){
            ppanel = new DiscardPanel(this);
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.FREEBIE){ //can use Freebie to get result of a card
            ppanel = new InactivePanel(this); 
            spanel = new FreebieStorePanel(this);
//        } else if (gm.getActivePlayer().playerTurn == Player.Turn.TRASHING){
//            ppanel = new TrashPanel(this);
//            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.MINING){
            ppanel = new MiningPanel(this);
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.REDRAWING){
            ppanel = new RedrawPanel(this);
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.REMODELING){
            ppanel = new RemodelPanel(this); //Remodel sets player Turn to Freebie after it's done
            spanel = new InactiveStorePanel(this);
        } else if (gm.getActivePlayer().playerTurn == Player.Turn.WAITING){
            System.out.println("Active player is waiting, this should never happen, something's wrong.");
        }
            
        ppanel.repaint();
        ppanel.revalidate();
        spanel.repaint();
        spanel.revalidate();
        mainPanel.add(spanel);
        mainPanel.add(ppanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        //scroll = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.repaint();
        scroll.revalidate();
        frame.repaint();
        frame.revalidate();
        //System.out.println(gm.getActivePlayer().playerTurn);
        //spanel.update();
    }
    
//    public static void main(String[] args) {
//        View testview = new View();
//        ArrayList<String> temp = new ArrayList();
//        temp.add("Steven");
//        temp.add("Neal");
//        temp.add("Kelly");
//        temp.add("Zach");
//        testview.GameStart(temp);
//    }
    
    
    
    
    
}
