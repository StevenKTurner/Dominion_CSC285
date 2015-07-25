import java.util.*;

/**
 * @author Zach
 **/

public class Store {
    
    //Main ArrayList to hold the 10 action card store stacks.
    ArrayList<ArrayList<Card>> storeStacks = new ArrayList<>();
    
    //Ten action cards store stacks.
    ArrayList<Card> cellarStack = new ArrayList<>();
    ArrayList<Card> marketStack = new ArrayList<>(10);
    ArrayList<Card> mineStack = new ArrayList<>(10);
    ArrayList<Card> militiaStack = new ArrayList<>(10);
    ArrayList<Card> woodcutterStack = new ArrayList<>(10);
    ArrayList<Card> villageStack = new ArrayList<>(10);
    ArrayList<Card> smithyStack = new ArrayList<>(10);
    ArrayList<Card> workshopStack = new ArrayList<>(10);
    ArrayList<Card> remodelStack = new ArrayList<>(10);
    ArrayList<Card> moatStack = new ArrayList<>(10);
    
    //Victory point card store stacks.
    ArrayList<Card> estateStack = new ArrayList<>(12);
    ArrayList<Card> dutchyStack = new ArrayList<>(12);
    ArrayList<Card> provinceStack = new ArrayList<>(12);
    
    //int variable to hold the number of empty store stacks.
//    int emptyStacks;
    
    public Store(){
        createStacks();
    }
       
    public void createStacks () {
        //Adds the ten store stacks ArrayLists to one master ArrayList
        storeStacks.add(cellarStack);
        storeStacks.add(marketStack);
        storeStacks.add(mineStack);
        storeStacks.add(militiaStack);
        storeStacks.add(woodcutterStack);
        storeStacks.add(villageStack);
        storeStacks.add(smithyStack);
        storeStacks.add(workshopStack);
        storeStacks.add(remodelStack);
        storeStacks.add(moatStack);
              
        //How will the ten action card stack ArrayLists be populated with ten 
        //cards without having to use ten separate for loops? 
        fillDeck(cellarStack, new Cellar(), 10);
        fillDeck(marketStack, new Market(), 10);
        fillDeck(mineStack, new Mine(), 10);
        fillDeck(militiaStack, new Militia(), 10);
        fillDeck(woodcutterStack, new Woodcutter(), 10);
        fillDeck(villageStack, new Village(), 10);
        fillDeck(smithyStack, new Smithy(), 10);
        fillDeck(workshopStack, new Workshop(), 10);
        fillDeck(remodelStack, new Remodel(), 10);
        fillDeck(moatStack, new Moat(), 10);
        fillDeck(estateStack, new Estate(), 12);
        fillDeck(dutchyStack, new Dutchy(), 12);
        fillDeck(provinceStack, new Province(), 12);
        
        //System.out.println(cellarStack);
    }
    
    public void removeCard (Card card) {
        String name = card.getName();
        
        //Returns the name of the card passed as a parameter when removeCard 
        //is called. The switch statement determines which ArrayList is going
        //to have a card removed from it.
        switch (name) {
            case "cellar":
                cellarStack.remove(cellarStack.size()-1);
                break;
            case "market":
                marketStack.remove(marketStack.size()-1);
                break;
            case "mine":
                mineStack.remove(mineStack.size()-1);
                break;
            case "militia":
                militiaStack.remove(militiaStack.size()-1);
                break;
            case "woodcutter":
                woodcutterStack.remove(woodcutterStack.size()-1);
                break;
            case "village":
                villageStack.remove(villageStack.size()-1);
                break;
            case "smithy":
                smithyStack.remove(smithyStack.size()-1);
                break;
            case "workshop":
                workshopStack.remove(workshopStack.size()-1);
                break;
            case "remodel":
                remodelStack.remove(remodelStack.size()-1);
                break;
            case "moat":
                moatStack.remove(moatStack.size()-1);
                break;
            case "estate":
                estateStack.remove(estateStack.size()-1);
                break;
            case "dutchy":
                dutchyStack.remove(dutchyStack.size()-1);
                break;
            case "province":
                provinceStack.remove(provinceStack.size()-1);
                break;
            default:
                System.out.println("This default statement should never be reached");
        }
    }
    
    public boolean countEmptyStacks () {
        
        //Loops through the 10 action card stacks via the storeStacks "master"
        //ArrayList to count how many are empty.
        int emptyStacks = 0;
        for (ArrayList<Card> storeStack : storeStacks) {
            if (storeStack.isEmpty()) {
                emptyStacks++;
            }
        }
        //Returns true if 3 or more stacks are empty, false otherwise.
        return emptyStacks >= 3;
    }
    
    public boolean cardInStock (Card card) {
        String name = card.getName();
        boolean inStock = true;
        
        //Similar to the switch statement in the removeCard method. Determines
        //the name of the card passed as a parameter and sets the boolean variable
        //inStock to true or false and then returns inStock.
        switch (name) {
            case "cellar":
                inStock = !cellarStack.isEmpty();
                System.out.println("Cellar Stack Contains: " + cellarStack);
                break;
            case "market":
                inStock = !marketStack.isEmpty();
                break;
            case "mine":
                inStock = !mineStack.isEmpty();
                break;
            case "militia":
                inStock = !militiaStack.isEmpty();
                break;
            case "woodcutter":
                inStock = !woodcutterStack.isEmpty();
                break;
            case "village":
                inStock = !villageStack.isEmpty();
                break;
            case "smithy":
                inStock = !smithyStack.isEmpty();
                break;
            case "workshop":
                inStock = !workshopStack.isEmpty();
                break;
            case "remodel":
                inStock = !marketStack.isEmpty();
                break;
            case "moat":
                inStock = !moatStack.isEmpty();
                break;
            case "estate":
                inStock = !estateStack.isEmpty();
                break;
            case "dutchy":
                inStock = !dutchyStack.isEmpty();
                break;
            case "province":
                inStock = !provinceStack.isEmpty();
                break;
            default:
                System.out.println("This default statement should never be reached");
        }
        
        return inStock;
    }
    
 //Currently adds the same card 10 times to each deck, might be a problem in the future.
    public void fillDeck(ArrayList<Card> arrayList, Card card, int amount) {
        for (int i = 0; i <= amount-1; i++) {
            arrayList.add(i, card);
            //System.out.println(card + " added");
        }
}
}
