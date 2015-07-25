public class ActionMine extends Action {


    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().playerTurn = Player.Turn.MINING;
    }
}
