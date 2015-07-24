public class ActionWoodcutter extends Action {
	public ActionWoodcutter() {
            
	actionPointsGained = 0;
	cashGained = 2;
	buysGained = 1;
        drawGain = 0;
        phaseChange = false;
        newPhase = "";
        description = "+1 Buy \n"
                + "+2 Cash";
	}
}
