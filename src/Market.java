/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Market extends Card {

    public Market() {
       setName("market");
       setType("Action");
       setCost(5);
       setAction(new ActionMarket());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/market.jpg");
    }
}
