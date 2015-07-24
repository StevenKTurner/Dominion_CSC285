/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class ActionCaller {
    SimpleActionFactory factory;
    
    public ActionCaller(SimpleActionFactory factory) { 
		this.factory = factory;
	}
 
	public Action useAction(String name) {
		Action action;
 
		action = factory.useAction(name);
 
                //list of all parts of each card
                //parts return 0 if no change
		action.description();
                action.gainCash();
		action.gainBuys();
		action.gainActions();
		action.drawCard();

		return action;
	}
    
}
