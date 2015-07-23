public class ActionMilitia extends Action {
	public ActionMilitia() {
            
	actionPointsGained = 0;
	cashGained = 2;
	buysGained = 0;
        drawGain = 0;
        phaseChange = true;
        newPhase = "militia";
        description = "+2 Cash \nEach other player discards \n"
                + "down to 3 cards in his hand";
        
        
	}
        
        @Override
        public void initialize(GameManager gm){
            gm.getActivePlayer().addActionPoints(actionPointsGained);
            gm.getActivePlayer().addActionCardCash(cashGained);
            gm.getActivePlayer().addBuys(buysGained);
            gm.getActivePlayer().drawCards(drawGain);
            
            gm.setCurrentTurn(new discardPhase(gm));
            
        }
}
