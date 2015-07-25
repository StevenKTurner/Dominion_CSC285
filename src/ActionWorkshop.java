public class ActionWorkshop extends Action {

    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().playerTurn = Player.Turn.FREEBIE;
        view.getGameManager().getActivePlayer().setFreebieValue(4);
    }
}
