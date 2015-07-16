/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class cellar implements ActionStack{
    
    
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
    
}
