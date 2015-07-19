
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
    
    ArrayList<Player> players = new ArrayList<>(); //list of all the players in the game
    Store store = new Store(); // the store for the game
    Turn currentTurn;
    Action currentAction;
    Player activePlayer; //The player whose turn it is
    boolean discardInEffect = false; //(may not be necessary) whether the players need to discard down in their turn due to Militia
    int tempHandLimit; //limit to draw down to
    ArrayList<Integer> scores = new ArrayList<>(); //the players' scores at the end of the game, empty until the end of the game
    
    //adds the players to the player array and sets an active player
    public void createGame(ArrayList<String> playerNames){
        for (String name : playerNames){
            players.add(new Player(name));
        }
        activePlayer = players.get(0);
        setCurrentTurn(new actionPhase(this));
    }
    
    //tests whether the end game conditions are tru
    public boolean isEndGame(){
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
    public void handleAction(Action action){
        currentAction = action;
        currentAction.initialize(this);
    }
    
    //Makes whatever the current turn is do its thing
    public void initiateTurn(){
        currentTurn.use();
    }
    
    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    public Player getActivePlayer(){
        return activePlayer;
    }
    
    public void setActivePlayer(Player player){
        activePlayer = player;
    }
    
    public Store getStore(){
        return store;
    }
    
    public Turn getCurrentTurn(){
        return currentTurn;
    }
    
    public void setCurrentTurn(Turn turn){
        currentTurn = turn;
    }
    
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
    
}
