/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n00000158
 */
public class MoneyStack implements Card {

        public static final MoneyStack GOLD = new MoneyStack(3, Card.Gold);
        public static final MoneyStack SILVER = new MoneyStack(2, Card.Silver);
        public static final MoneyStack COPPER = new MoneyStack(1, Card.Copper);

        int value = 0;
        Card type;

        private MoneyStack(int value, Card type) {
                this.value = value;
                this.type = type;
        }
        
        public int value() {
                return this.value;
        }

        public String toString() {
                return this.type.name();
        }

        public Card getType() {
                return this.type;
        }

}