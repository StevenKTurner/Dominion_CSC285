public class ActionCellar extends Action {

        
        public void initialize(View view){
            view.getGameManager().getActivePlayer().addActionPoints(actionPointsGained);
            view.getGameManager().getActivePlayer().playerTurn = Player.Turn.REDRAWING;
        }
}
