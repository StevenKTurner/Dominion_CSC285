public class ActionMoat extends Action {


    @Override
    void initialize(View view) {
        view.getGameManager().getActivePlayer().drawCards(2);
    }
        
        
}
