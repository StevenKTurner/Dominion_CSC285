public class ActionVillage extends Action {


    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().drawCards(1);
        view.getGameManager().getActivePlayer().addActionPoints(2);
    }
}
