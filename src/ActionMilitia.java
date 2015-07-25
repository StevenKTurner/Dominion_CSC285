public class ActionMilitia extends Action {

        
        @Override
        public void initialize(View view){
            view.getGameManager().getActivePlayer().addActionCardCash(cashGained);
            view.getGameManager().setDiscardInEffectTrue(buys);
            for (Player player : view.getGameManager().getPlayers()){
                if (player.playerTurn == Player.Turn.WAITING){
                    player.playerTurn = Player.Turn.DISCARDING;
                }
            }
            
        }
}
