
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Player {
    
    private String name; //Players name
    private Hand hand; //Hand object that holds the cards for each turn
    private Deck deck; //Deck object which holds the player's cards
    private DiscardPile discardPile; //Discard object which hold discarded cards
    private int actions; //the number of actions the player has per turn
    private int buys; //the number of buys the player has per turn
    
    public Player(String name){
        
        this.name = name;
        setActions(1);
        setBuys(1);
        deck = new Deck(this);
        hand = new Hand(this);
        discardPile = new DiscardPile(this);
        
    }
    
    //Allows player to begin turn by telling the Hand to get setup.
    //That includes drawing up to 5 and shuffling the discard back
    //into the deck if necessary.  This is why the Deck and Discard
    //are passed in
    public void beginTurn(){
        hand.setup(deck, discardPile);
        actions = 1;
        buys = 1;
    }
    
    //Uses a card if the player has available actions, and reduces actions
    //if done. Displays warning message if no actions left.
    public void useCard(Card card){
        if (actions > 0){
            //Call method(s) of card that may pass values back to player, such as extra buys
            
            //Then move the card to the discard pile so it can't be used again
            discard(card);
            discardPile.addCard(card);
            actions--;
        } else JOptionPane.showMessageDialog(null, "No Actions Left");
    }
    
    // useBuy() only reduces a player's buy count, as the adding 
    //of the card to the discard pile should be a function of the 
    //shop stack itself
    public void useBuy(){
        buys--;
    }
    
    //tells hand to draw up to 5 cards
    public void drawCards(){
        hand.drawCards();
    }
    
    //tells hand to discard cards
    public void discard(ArrayList<Card> cards){
        hand.discard(cards, discardPile);
    }
    public void discard(Card card){
        hand.discard(card, discardPile);
    }
    
    public void trashCard(Card card){
        card.destroy();
    }
    
    public void setActions(int actions){
        this.actions = actions;
    }
    
    public int getActions(){
        return actions;
    }
    
    public void setBuys(int buys){
        this.buys = buys;
    }
    
    public int getBuys(){
        return buys;
    }
    
}
