public class ActionSmithy extends Action {


    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().drawCards(3);
    }
}
