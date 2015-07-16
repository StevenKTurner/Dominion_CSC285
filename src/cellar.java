/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class cellar implements Card{
    
    
    private String name = "Cellar";
    private String type = "Action";
    private int cost = 2;
    private Action action; //gives 1 action, discard any number of cards.  +1 card per card discarded.
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;
    
    // +1 action
    // Discard any number of cards.  +1 card per card discarded.
        public cellar() {
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public Action getAction() {
        return action;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getCashValue() {
        return cashValue;
    }
    
    public boolean isAttack(){
        return attack;
    }
    
    public boolean isReaction(){
        return reaction;
    }
}
