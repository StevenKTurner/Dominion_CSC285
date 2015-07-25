public class ActionRemodel extends Action {
    Card cardTrashed, cardGained;
    Player player;
    public ActionRemodel(View view) {
        GameManager gm = view.getGameManager();
        player = gm.getActivePlayer();
	actionPointsGained = 0;
	cashGained = 0;
	buysGained = 0;
        drawGain = 0;
        freebieValue = 0;
        phaseChange = true;
        newPhase = "remodel";
        description = "Trash a card from your hand \n"
                + "Gain a card costing up to 2 more \n"
                + "than the trashed card.";
        

	}
        
        public void remodelPlayed () {
            //Select card to trash            
            freebieValue = cardTrashed.getCost();
            freebieValue += 2; 
            player.trashCard(cardTrashed, player.inPlay);
            //display freebieStorePanel            
            player.discard(cardGained);
            //return to previous panel
        }
}
