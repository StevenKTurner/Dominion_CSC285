public class MilitiaAction extends Action {
	public MilitiaAction() {
            
	actionPointsGained = 0;
	cashGained = 2;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "militia";
        description = "+2 Cash \nEach other player discards \n"
                + "down to 3 cards in his hand";
	}
}
