/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class VictoryStack implements Card {

        public static final VictoryStack Estate = new VictoryStack(1, Card.Estate);
        public static final VictoryStack Duchy = new VictoryStack(3, Card.Duchy);
        public static final VictoryStack Province = new VictoryStack(6, Card.Province);

        int value = 0;
        Card type;

        private VictoryStack(int value, Card type) {
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
}