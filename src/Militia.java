/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Militia extends Card {

    public Militia() {
       setName("militia");
       setType("Action");
       setCost(4);
       setAction(new MilitiaAction());
       setValue(0);
       setCashValue(0);
       setAttack(true);
       setReaction(false);
       setImage("cardArt/militia.jpg");
    }
}
