public class WorkshopAction extends Action {
	public WorkshopAction() {
            
	actionPointsGained = 0;
	cashGained = 0;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "workshop";
        description = "Gain a card costing up to 4 Cash";
	}
}
