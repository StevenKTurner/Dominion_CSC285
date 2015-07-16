/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class remodel implements Card{
    
    private String name = "Remodel";
    private String type = "Action";
    private int cost = 4;
    private Action action; //......
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;
    
    // Trash a treasure card from hand.  Gain a card costing up to 2 monies more than the trashed card.  
    
    
        public remodel() {
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
