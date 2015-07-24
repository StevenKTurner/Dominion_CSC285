public class ActionMoat extends Action {
	public ActionMoat() {
            
	actionPointsGained = 0;
	cashGained = 0;
	buysGained = 0;
        drawGain = 2;
        phaseChange = false;
        newPhase = "";
        description = "+2 Cards \n"
                + " \n"
                + "When another player plays an Attack \n"
                + "card, you may reveal this from your \n"
                + "hand. If you do, you are unaffected \n"
                + "by that Attack \n";
	}
}
