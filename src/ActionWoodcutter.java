public class ActionWoodcutter extends Action {


    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().addActionPoints(1);
        view.getGameManager().getActivePlayer().addActionCardCash(2);
    }
}
