import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    private List<Card> deck;

    public Dealer(){
        deck = new ArrayList<>();
        String[] ranks = {"2","3","4","5","6","7","8","9","J","Q","K","A"};

        for(Suit suit : Suit.values()){
            for(String rank : ranks){
                deck.add(new Card(suit, rank));
            }
        }
        shuffle();
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public Card dealCard(){
        return deck.remove(deck.size() - 1);
    }
}