/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
class Village implements Card {

    public Village() {
    }

    @Override
    public int getCost() {
        return 1; //test value
    }

    @Override
    public Action getAction() {
        return new Action();
    }

    @Override
    public String getName() {
        return "village";
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getValue() {
        return 1; //Test value
    }

    @Override
    public int getCashValue() {
        return 0; //Test value
    }
    
}
