/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Moat extends Card{
    
    public Moat() {
       setName("moat");
       setType("Action / Reaction");
       setCost(2);
       setAction(new ActionMoat());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(true);
       setImage("cardArt/moat.jpg");
    }

}
