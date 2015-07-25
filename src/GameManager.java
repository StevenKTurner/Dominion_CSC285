
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class GameManager {
    
    ArrayList<Player> players;
    Store store; // the store for the game
    Action currentAction; // I think the view will handle Actions now, not the GM.
    Player activePlayer; //The player whose turn it is
    boolean discardInEffect; //(may not be necessary) whether the players need to discard down in their turn due to Militia
    private int tempHandLimit; //limit to draw down to
    ArrayList<Integer> scores; //the players' scores at the end of the game, empty until the end of the game
    
    //adds the players to the player array and sets an active player
    public GameManager(ArrayList<String> playerNames){
        //store.createStacks();
        players = new ArrayList<>(); //list of all the players in the game
        store = new Store(); // the store for the game
        discardInEffect = false; //(may not be necessary) whether the players need to discard down in their turn due to Militia
        tempHandLimit = 5; //limit to draw down to
        scores = new ArrayList<>(); //the players' scores at the end of the game, empty until the end of the game
        
        for (String name : playerNames){
            players.add(new Player(name));
        }
        activePlayer = players.get(0);
        activePlayer.beginTurn();
    }
    
    //tests whether the end game conditions are tru
    public boolean isEndGame(){
//        System.out.println("Empty Stacks: " + store.countEmptyStacks());
//        System.out.println("Province cards: " + store.cardInStock(new Province()));
        if (store.countEmptyStacks() || !store.cardInStock(new Province())){
            return true;
        } else return false;
    }
    
    //tells the players to score their cards and stores it in the score array list.
    public void endGame(){
        int i = 0;
        for (Player player : players){
            scores.add(i, player.scoreDeck());
            i++;
        }
    }
    
    //may need to change based on how actions work
//    public void handleAction(Action action){
//        currentAction = action;
//        currentAction.initialize(this);
//    }
    
    //Makes whatever the current turn is do its thing
//    public void initiateTurn(){
//        currentTurn.use();
//    }
    
    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    public Player getActivePlayer(){
        return activePlayer;
    }
    
    public void startNextPlayerTurn(){
//        System.out.println(activePlayer.getName() + "ends turn");
        activePlayer.endTurn();
        int turnNumber = players.lastIndexOf(activePlayer);
        if ((turnNumber+1) >= players.size()){
            activePlayer = players.get(0);
        } else{
            activePlayer = players.get(turnNumber+1);
        }
//        System.out.println(activePlayer.getName() + " begins turn");
        activePlayer.beginTurn();
    }
    
    public void setActivePlayer(Player player){
        activePlayer.playerTurn = Player.Turn.WAITING;
        activePlayer = player;
        activePlayer.playerTurn = Player.Turn.ACTION;
        
    }
    
    public Store getStore(){
        return store;
    }
    
//    These are Unnecessary, as playerTurn is public now.
//    public Player.Turn getCurrentTurn(){
//        return activePlayer.playerTurn;
//    }
//    
//    public void setCurrentTurn(Player.Turn turn){
//        activePlayer.playerTurn = turn;
//    }
    
    public boolean isDiscardInEffect(){
        return discardInEffect;
    }
    
    //Sets discard in effect and sets temporary hand limit to amount provided
    public void setDiscardInEffectTrue(int amount){
        discardInEffect = true;
        tempHandLimit = amount;
    }
    
    //turns off discard in effect
    public void setDiscardInEffectFalse(){
        discardInEffect = false;
        tempHandLimit = 5;
    }
    
    public int getTempHandLimit(){
        return tempHandLimit;
    }
    
}
