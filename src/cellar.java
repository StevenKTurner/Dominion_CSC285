/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Cellar extends Card{
    
    // +1 action
    // Discard any number of cards.  +1 card per card discarded.
        public Cellar() {
            setName("cellar");
            setType("Action");
            setCost(2);
            setAction(new ActionCellar());//gives 1 action, discard any number of cards.  +1 card per card discarded.
            setValue(0);
            setCashValue(0);
            setAttack(false);
            setReaction(false);
            setImage("cardArt/cellar.jpg");
    }

}
