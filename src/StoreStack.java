
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class StoreStack {
    
    private int hand, deck, size, discard;
    
    public StoreStack(){
    
    ArrayList<Card> storeCardList;
        
    storeCardList = new ArrayList();
    }
    
    public int addCard(){
        
    }
    
    public int sendToDeck() {
         return this.deck;
    }
 
    public int sendToHand() {
        return this.hand;
    }

    public int getSize(){
        return this.size;
    }
    
    public int sendToDiscard(){
      return this.discard;  
    }
}
