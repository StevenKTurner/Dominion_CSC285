/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Estate extends Card{
    
    public Estate(){
       setName("estate");
       setType("Victory Point");
       setCost(2);
       setAction(null);
       setValue(1);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/estate.jpg");
    }
}
