public class SimpleActionFactory {
    
    public Action useAction(String name) {
		Action action = null;

		             
                
                if (name.equals("celler")) {
                    action = new ActionCellar(); 
                }else if (name.equals("market")) {
			action = new ActionMarket();
		} else if (name.equals("militia")) {
			action = new ActionMilitia();
		} else if (name.equals("mine")) {
			action = new ActionMine();
		} else if (name.equals("moat")) {
			action = new ActionMoat();
		} else if (name.equals("remodel")) {
			action = new ActionRemodel();
		} else if (name.equals("smithy")) {
			action = new ActionSmithy();
		} else if (name.equals("villageCard")) {
			action = new ActionWoodcutter();
		} else if (name.equals("woodcutter")) {
			action = new ActionWoodcutter();
		} else if (name.equals("workshop")) {
			action = new ActionWorkshop();
		}
		return action;
    
}
    }
