/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public interface Card {
    
    public int getCost();
    public Action getAction();
    public String getName();
    public String getType();
    public int getValue();
    public int getCashValue();
    
}
