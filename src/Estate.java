/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Estate implements Card{
    
    private String name = "Estate";
    private String type = "Victory Point";
    private int cost = 2;
    private Action action = null; 
    private int value = 1;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
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
    public int getValue() {
        return value;
    }

    @Override
    public int getCashValue() {
        return cashValue;
    }

    @Override
    public boolean isAttack() {
        return attack;
    }

    @Override
    public boolean isReaction() {
        return reaction;
    }
    
}
