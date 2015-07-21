/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Province extends Card{
    
    public Province(){
       setName("province");
       setType("Victory Point");
       setCost(8);
       setAction(null);
       setValue(6);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/province.jpg");
    }
}
