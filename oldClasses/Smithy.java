/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Smithy implements Card{
    
    private String name = "Smithy";
    private String type = "Action";
    private int cost = 4;
    private Action action = new SmithyAction(); //gives 3 cards
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;
    

    public int getCost() {
        return cost;
    }

    public Action getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

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
