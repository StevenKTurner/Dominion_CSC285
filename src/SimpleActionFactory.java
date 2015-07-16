/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k11002227
 */
public class SimpleActionFactory {
    
    public Action useAction(String name) {
		Action action = null;

		             
                
                if (name.equals("celler")) {
                    action = new CellarAction(); 
                }else if (name.equals("market")) {
			action = new MarketAction();
		} else if (name.equals("militia")) {
			action = new MilitiaAction();
		} else if (name.equals("mine")) {
			action = new MineAction();
		} else if (name.equals("moat")) {
			action = new MoatAction();
		} else if (name.equals("remodel")) {
			action = new RemodelAction();
		} else if (name.equals("smithy")) {
			action = new SmithyAction();
		} else if (name.equals("villageCard")) {
			action = new WoodcutterAction();
		} else if (name.equals("woodcutter")) {
			action = new WoodcutterAction();
		} else if (name.equals("workshop")) {
			action = new WorkshopAction();
		}
		return action;
    
}
    }
