public class ActionRemodel extends Action {

    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().playerTurn = Player.Turn.REMODELING;
    }
}
