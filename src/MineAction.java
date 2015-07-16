public class MineAction extends Action {
	public MineAction() {
            
	actionPointsGained = 0;
	cashGained = 0;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "mine";
        description = "Trash a Treasure card from your hand \n"
                + "Gain a Treasure card costing up to \n"
                + "3 more; put it into your hand";
	}
}
