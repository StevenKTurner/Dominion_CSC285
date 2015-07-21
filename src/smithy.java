/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Smithy extends Card{
    
    public Smithy(){
       setName("smithy");
       setType("Action");
       setCost(4);
       setAction(new SmithyAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/smithy.jpg");
    }
}
