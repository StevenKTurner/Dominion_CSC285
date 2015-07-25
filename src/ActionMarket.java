public class ActionMarket extends Action {

    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().addActionPoints(actionPointsGained);
        view.getGameManager().getActivePlayer().drawCards(drawGain);
        view.getGameManager().getActivePlayer().addBuys(buysGained);
        view.getGameManager().getActivePlayer().addActionCardCash(cashGained);
    }
}
