
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
    private ArrayList<Card> hand; //Hand object that holds the cards for each turn
    private ArrayList<Card> deck; //Deck object which holds the player's cards
    private ArrayList<Card> discardPile; //Discard object which hold discarded cards
    private int actions; //the number of actions the player has per turn
    private int buys; //the number of buys the player has per turn
    private int cash;
    private final int HAND_LIMIT = 5;
    
    public Player(String name){
        
        this.name = name;
        setActions(1);
        setBuys(1);
        
    }
    
    public void beginTurn(){
        actions = 1;
        buys = 1;
    }
    
    public void endTurn(){
        discard(hand);
        drawCards(HAND_LIMIT);
    }
    
    //Uses a card if the player has available actions, and reduces actions
    //if done. Displays warning message if no actions left.
    public void useCard(Card card){
        if (actions > 0){
            //Call method(s) of card that may pass values back to player, such as extra buys
            
            //Then move the card to the discard pile so it can't be used again
            discard(card);
            actions--;
        } else JOptionPane.showMessageDialog(null, "No Actions Left");
    }
    
    //If player has enough money and buys, player removes card from a StoreStack and places that card in their
    //Discard Pile
    public void useBuy(StoreStack stack){
        Card card = stack.getCard();
        if ((cash > card.getCost()) && (buys > 0)){
            discardPile.add(card);
            stack.remove(card);
            buys--;
            cash -= card.getCost();
        } else JOptionPane.showMessageDialog(null, "Cannot Afford Card or Out of Buys");
    }
    
    //tells hand to draw up to 5 cards
    public void drawCards(int amount){
        while(amount > 0){
            if(deck.size() <= 0){
                deck.addAll(discardPile);
                discardPile.clear();
            }
            int shuffledCard = (int)(Math.random()*(deck.size()-1));
            hand.add(deck.get(shuffledCard));
            deck.remove(shuffledCard);
            amount--;
        }
    }
    
    //tells hand to discard cards
    public void discard(ArrayList<Card> cards){
        for(int i = cards.size()-1; i >= 0; i--){
            discardPile.add(i);
            cards.remove(i);
        }
    }
    public void discard(Card card){
        discardPile.add(card);
        hand.remove(card);
    }
    
    public void trashCard(Card card, ArrayList<Card> source){
        int location = source.lastIndexOf(card);
        source.remove(location);
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
    
    public void setCash(int cash){
        this.cash = cash;
    }
    
    public int getCash(){
        return cash;
    }
    
    public void addCash(int amount){
        cash += amount;
    }
    
    public void removeCash(int amount){
        cash -= amount;
    }
    
}
