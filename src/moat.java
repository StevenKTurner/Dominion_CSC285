/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Moat implements Card{
    
    private String name = "Moat";
    private String type = "Action / Reaction";
    private int cost = 2;
    private Action action = new MoatAction(); //gives 2 cards
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = true;
    
    // +2 cards
    //when another player plays an attack card, you may reveal this from your hand.  If you do, you are uneffected be the attack.
    
    
        public Moat() {
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
