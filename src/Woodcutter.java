/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Woodcutter implements Card {
    
    private String name = "woodcutter";
    private String type = "Action";
    private int cost = 3;
    private Action action; //+1 Buy, +2 Cash
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;

    public Woodcutter() {
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
