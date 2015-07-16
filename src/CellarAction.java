public class CellarAction extends Action {
	public CellarAction() {
            
	actionPointsGained = 1;
	cashGained = 0;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "cellar";
        description = "+1 Action \nDiscard any number of cards. \n"
                       + "+1 Card per card discarded.";
	}
}
