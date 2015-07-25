
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class Player {
    
    private String name; //Players name
    private ArrayList<Card> hand; //Hand object that holds the cards for each turn
    private ArrayList<Card> deck; //Deck object which holds the player's cards
    private ArrayList<Card> discardPile; //Discard object which hold discarded cards
    public ArrayList<Card> inPlay; //Cards that have been used but not discarded yet
    private int actionPoints; //the number of actions the player has per turn
    private int buys; //the number of buys the player has per turn
    private int cash;
    private int actionCardCash;
    private int freebieValue;
    private final int HAND_LIMIT = 5;
    public enum Turn{ACTION, BUYING, FREEBIE, DISCARDING, TRASHING, WAITING};
    public Turn playerTurn = Turn.WAITING;
    private boolean discardInEffect = false;
    
    public Player(String name){
        
        this.name = name;
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();
        discardPile = new ArrayList<Card>();
        inPlay = new ArrayList<Card>();
        
        for (int i = 0; i < 7; i++){
            deck.add(new Copper());
        }
        for (int i = 0; i < 3; i++){
            deck.add(new Estate());
        }
        deck = shuffleCards(deck);
        drawCards(HAND_LIMIT);
        
    }
    
    public void beginTurn(){
        setActionPoints(1);
        setBuys(1);
        setActionCardCash(0);
        countCash(hand);
        playerTurn = Turn.ACTION;
    }
    
    public void endTurn(){
        discard(inPlay); //discard cards that have been played
        discard(hand); //discard any cards left in hand
        drawCards(HAND_LIMIT); //draw up to 5 cards
        setActionPoints(0);
        setBuys(0);
        setActionCardCash(0);
        setCash(0);
        playerTurn = Turn.WAITING;
    }
    
    //Uses a card if the player has available actions, and reduces actions
    //if done. Displays warning message if no actions left.
    public Action useCard(Card card){
        Action action;
        if (actionPoints > 0){
            //Call method(s) of card that may pass values back to player, such as extra buys
            action = card.getAction();
            //Then move the card to the "In Play" area so it can't be used again
            //We're keeping it out of discard to prevent it from being shuffled back into the deck on the same turn
            inPlay.add(card);
            hand.remove(card);
            actionPoints--;
        } else {
            JOptionPane.showMessageDialog(null, "No Actions Left");
            action = null;
        }
        
        return action;
    }
    
    //If player has enough money and buys, player removes card from the Store and places that card in their
    //Discard Pile
    public void useBuy(Store store, Card storeCard){
        boolean inStock = store.cardInStock(storeCard);
        Card card = storeCard;
        if ((cash >= card.getCost()) && (buys > 0) && (inStock)){
            discardPile.add(card);
            store.removeCard(card);
            buys--;
            cash -= card.getCost();
        } else JOptionPane.showMessageDialog(null, "Cannot Afford Card or Out of Buys or Out of Stock");
    }
    
    public ArrayList<Card> shuffleCards(ArrayList<Card> cards){
        ArrayList<Card> shuffledCards = new ArrayList<>();
        
        for (int i = cards.size()-1; i >= 0; i--){
            int random = (int) Math.floor(Math.random() * i);
            shuffledCards.add(cards.get(random));
            cards.remove(random);
        }
        
        return shuffledCards;
    }
    
    //tells hand to draw specified number of cards
    public void drawCards(int amount){
        while(amount > 0){
            if(deck.size() <= 0){
                deck.addAll(discardPile);
                discardPile.clear();
                deck = shuffleCards(deck);
                if(deck.size() <= 0){
                    return;
                }
            }
            hand.add(deck.get(0)); //adds top card of deck to hand
            deck.remove(0); // removes top card of deck
            
            amount--;
        }
    }
    
    //tells hand to discard cards
    public void discard(ArrayList<Card> cards){
        for(int i = cards.size()-1; i >= 0; i--){
            discardPile.add(cards.get(i));
            cards.remove(i);
        }
    }
    
    public void discard(Card card){
        discardPile.add(card);
        hand.remove(card);
    }
    
    public void trashCard(Card card, ArrayList<Card> source){
        source.remove(card);
    }
    
    public int scoreDeck(){
        int score = 0;
        
        //put all the players cards in the discard pile for easier counting
        discard(hand);
        discard(inPlay);
        discard(deck);
        
        for (int i = 0; i < discardPile.size(); i++){
            score += discardPile.get(i).getValue();
        }
        
        return score;
        
    }
    
    public ArrayList<Card> getHand(){
        return hand;
    }
    
    public ArrayList<Card> getDeck(){
        return deck;
    }
    
    public ArrayList<Card> getInPlay(){
        return inPlay;
    }
    
    public ArrayList<Card> getDiscardPile(){
        return discardPile;
    }
    
    public void setActionPoints(int actions){
        this.actionPoints = actions;
    }
    
    public void addActionPoints(int actions){
        this.actionPoints += actions;
    }
    
    public int getActionPoints(){
        return actionPoints;
    }
    
    public void setBuys(int buys){
        this.buys = buys;
    }
    
    public int getBuys(){
        return buys;
    }
    
    public void addBuys(int buys){
        this.buys += buys;
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
    
    public void addActionCardCash(int amount){
        actionCardCash += amount;
        countCash(hand);
    }
    
    private void setActionCardCash(int amount){
        actionCardCash = amount;
    }
    
    //Need to fix so that Cash added from action cards aren't removed when this is called
    private void countCash(ArrayList<Card> cards){
        cash = 0;
        for(Card card : cards){
            cash += card.getCashValue();
        }
        cash += actionCardCash;
    }
    
    public boolean isDiscardInEffect(){
        return discardInEffect;
    }
    
    public void setDiscardInEffect(boolean tf){
        discardInEffect = tf;
    }
    
    public String getName(){
        return name;
    }
    
//    public static void main(String[] args) {
//        Player player = new Player("Steven");
//        Store store = new Store();
//        store.createStacks();
//        
//        player.beginTurn();
//        player.setBuys(100);
//        player.addActionCardCash(100);
//        System.out.println("Actions " + player.getActionPoints());
//        System.out.println("Cash " + player.getCash());
//        System.out.println("Buys " + player.getBuys());
//        System.out.println("Starting Hand:");
//        for (int i = player.getHand().size()-1; i >= 0; i--){
//            System.out.println(player.getHand().get(i));
//        }
//        
//        System.out.println("Trashing first card");
//        player.trashCard(player.getHand().get(0), player.getHand());
//        System.out.println("Hand after trashing:");
//        for (int i = player.getHand().size()-1; i >= 0; i--){
//            System.out.println(player.getHand().get(i));
//        }
//        
//        System.out.println("Villages in Store: " + store.cardInStock(new Village()));
//        for (int i = 1; i <= 11; i++){
//            player.useBuy(store, new Village());
//        }
//        System.out.println("Villages in Store: " + store.cardInStock(new Village()));
//        Action action = player.useCard(player.getHand().get(0));
//        
//        System.out.println("Discard Pile:");
//        for (int i = player.getDiscardPile().size()-1; i >= 0; i--){
//            System.out.println(player.getDiscardPile().get(i));
//        }
//        System.out.println("In Play:");
//        for (int i = player.getInPlay().size()-1; i >= 0; i--){
//            System.out.println(player.getInPlay().get(i));
//        }
//        System.out.println("Hand:");
//        for (int i = player.getHand().size()-1; i >= 0; i--){
//            System.out.println(player.getHand().get(i));
//        }
//        System.out.println("Cash " + player.getCash());
//        System.out.println("Buys " + player.getBuys());
//        
//        player.endTurn();
//        System.out.println("Turn ended");
//        System.out.println("Cash " + player.getCash());
//        System.out.println("Buys " + player.getBuys());
//        
//        System.out.println("Score " + player.scoreDeck());
//        
//        System.out.println("Card Action: " + action);
        
//        System.out.println("Discard pile");
//        for (int i = player.getDiscardPile().size()-1; i >=0; i--){
//            System.out.println(player.getDiscardPile().get(i));
//        }
//        
//    }
    
}
