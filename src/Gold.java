/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Gold extends Card {

    public Gold() {
       setName("gold");
       setType("Money");
       setCost(6);
       setAction(null);
       setValue(0);
       setCashValue(3);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/gold.jpg");
    }
}
