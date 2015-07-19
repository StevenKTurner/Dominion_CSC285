/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Militia implements Card {
    
    private String name = "militia";
    private String type = "Action";
    private int cost = 4;
    private Action action = new MilitiaAction(); //+2 Cash, Each other player discards down to 3 cards
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = true;
    private boolean reaction = false;

    public Militia() {
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
