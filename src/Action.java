abstract public class Action {
    //stuff being passed in:
        int actionPoints;
        int cash;
        int buys;
    //stuff not being passed in:
	int actionPointsGained;
	int cashGained;
	int buysGained;
        int drawGain;
        boolean phaseChange;
        String newPhase;
        String description;

        public void initialize(GameManager gm){
            
        }
        
        public void description() {
            System.out.println(description);
        }

	public void gainCash() {
		cash = cash + cashGained;
                System.out.println(cashGained + " cash gained.");
	}

	public void gainBuys() {
		buys = buys + buysGained;
                System.out.println(actionPointsGained + " buy(s) gained.");
	}

	public void gainActions() {
		actionPoints = actionPoints + actionPointsGained;
                System.out.println(actionPointsGained + " action(s) gained.");
	}
        
        //draws specified # of cards from top of deck
        public void drawCard() {
                for (int i=0; i<drawGain; i--) {
                    hand.add(deck.get(0));
                }
            
        }
     
}

