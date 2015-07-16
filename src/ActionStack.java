/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public interface ActionStack {

        int value = 0;
        Card type;
	  Card action;

	  int buyPoints = 0;

        private ActionStack(int value, Card type) {
                this.value = value;
                this.type = type;
        }

        public int value() {
                return this.value;
        }

        public Card getType() {
                return this.type;
        }

        public String toString() {
                return this.type.name();
        }

	  public Card getAction(){
	  this.action = action;
}
	  public Card setAction(){
	  		return this.action;
}
}
    
}
