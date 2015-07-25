public class ActionCellar extends Action {

        
        public void initialize(View view){
            view.getGameManager().getActivePlayer().addActionPoints(1);
            view.getGameManager().getActivePlayer().playerTurn = Player.Turn.REDRAWING;
        }
}
