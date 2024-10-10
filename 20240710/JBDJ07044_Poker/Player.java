import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    
    public Player() {
        hand = new ArrayList<>();
    }
    
    public void receiveCard(Card card) {
        hand.add(card);
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    @Override
    public String toString() {
        return hand.toString();
    }
    
    public void printHand() {
        System.out.print("[");
        for (Card card : hand) {
            System.out.print( card + " ");
        }
        System.out.println("]");
    }

}
