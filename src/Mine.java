/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Mine extends Card {

    public Mine() {
       setName("mine");
       setType("Action");
       setCost(5);
       setAction(new MineAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/mine.jpg");
    }

}
