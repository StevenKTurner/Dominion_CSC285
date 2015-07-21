/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Workshop extends Card{
    
    public Workshop(){
       setName("workshop");
       setType("Action");
       setCost(3);
       setAction(new WorkshopAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/workshop.jpg");
    }
}
