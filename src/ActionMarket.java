public class ActionMarket extends Action {

    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().addActionPoints(1);
        view.getGameManager().getActivePlayer().drawCards(1);
        view.getGameManager().getActivePlayer().addBuys(1);
        view.getGameManager().getActivePlayer().addActionCardCash(1);
    }
}
