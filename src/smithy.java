/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class smithy implements Card{
    
    private String name = "Smithy";
    private String type = "Action";
    private int cost = 4;
    private Action action; //gives 3 cards
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;
    
    // +3 cards
   
    
        public smithy() {
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
