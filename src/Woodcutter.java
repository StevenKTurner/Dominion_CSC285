/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Woodcutter extends Card {

    public Woodcutter() {
       setName("woodcutter");
       setType("Action");
       setCost(3);
       setAction(new WoodcutterAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/woodcutter.jpg");
    }

}
