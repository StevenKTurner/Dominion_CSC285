/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Workshop implements Card{
    
    private String name = "Workshop";
    private String type = "Action";
    private int cost = 3;
    private Action action = new WorkshopAction(); //buy a card with a value of up to 4
    private int value = 4;
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
