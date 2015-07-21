/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class Remodel extends Card{

    public Remodel() {
       setName("remodel");
       setType("Action");
       setCost(4);
       setAction(new RemodelAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/remodel.jpg");
    }

}
