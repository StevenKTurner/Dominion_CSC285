public class RemodelAction extends Action {
	public RemodelAction() {
            
	actionPointsGained = 0;
	cashGained = 0;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "remodel";
        description = "Trash a card from your hand \n"
                + "Gain a card costing up to 2 more \n"
                + "than the trashed card.";
	}
}
