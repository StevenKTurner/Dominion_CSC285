
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


//forces player to select a certain number of cards to discard


public class DiscardPanel extends PlayerPanel {
    
    private GameManager gm;
    private View view;
    private JLabel drawGainLabel;
    private JPanel statsPanel;
    private JPanel handPanel;
    private ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    private JButton endButton;
    
    public DiscardPanel(View view){
        gm = view.getGameManager();
        this.view = view;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        statsPanel = new JPanel();
        handPanel = new JPanel();

        endButton = new JButton("Discard Selected");
        endButton.addActionListener(new ActionPanel.EndButtonListener(this));
        
        this.add(statsPanel);
        this.add(handPanel);
        this.add(endButton);
        
        update();
    }    
    
    private void populateCardButtons(){
        for (Card card : gm.getActivePlayer().getHand()){
            cardButtons.add(new JButton(card.getImage()));
            handPanel.add(cardButtons.get(cardButtons.size()-1));
        }
    }    
    
    public void update(){

        drawGainLabel = new JLabel("Select" + 
                gm.getActivePlayer().getdrawGainLabel() + 
                "card(s) to discard.");
        
        statsPanel.add(drawGainLabel);
        
        populateCardButtons();  
        
        statsPanel.add(endButton);
        revalidate();
    }    
    
    private static class EndButtonListener implements ActionListener {
        
        private ActionPanel apanel;
        
        public EndButtonListener(ActionPanel apanel) {
            this.apanel = apanel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            apanel.gm.startNextPlayerTurn();
            apanel.update();
        }
    }
    
}
