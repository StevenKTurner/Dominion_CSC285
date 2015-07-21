/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Village extends Card {
    
    private String name = "Village";
    private String type = "Action";
    private int cost = 3;
    private Action action = new VillageAction(); //gives 2 actions
    private int value = 0;
    private int cashValue = 0;
    private boolean attack = false;
    private boolean reaction = false;

    public Village() {
       setName("village");
       setType("Action");
       setCost(3);
       setAction(new VillageAction());
       setValue(0);
       setCashValue(0);
       setAttack(false);
       setReaction(false);
       setImage("cardArt/village.jpg");
    }

}
