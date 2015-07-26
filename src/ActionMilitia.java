public class ActionMilitia extends Action {

        
        @Override
        public void initialize(View view){
            view.getGameManager().getActivePlayer().addActionCardCash(2);
            view.getGameManager().setDiscardInEffectTrue(3);
            for (Player player : view.getGameManager().getPlayers()){
                if (player.playerTurn == Player.Turn.WAITING){
                    player.playerTurn = Player.Turn.DISCARDING;
                    player.setDiscardInEffect(true);
                    System.out.println(player.getHand().size() - (player.getHand().size()-2));
                    player.setAmountToDiscard(player.getHand().size() - (player.getHand().size()-2));
                }
            }
            
        }
}
