public class cleanupPhase implements Turn {
    
    String turnType;
    Turn currentTurn;
    
    public cleanupPhase (GameManager gameManager) {
        //Send all cards in hand and in play to the discard pile
    }
    
    public void endPhase() {
        
    }
    
    public void use() {
    
    }

    @Override
    public int getPhase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
