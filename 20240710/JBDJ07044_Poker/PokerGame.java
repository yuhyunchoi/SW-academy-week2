import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of players: ");
        String numberOfPlayersStr = scanner.nextLine();
        int numberOfPlayers = Integer.parseInt(numberOfPlayersStr);

        Dealer dealer = new Dealer();
        Player[] players = new Player[numberOfPlayers];

        for(int i = 0; i < players.length ; i++){
            players[i] = new Player();
        }
        for(int i = 0; i < 5 ; i++){
            for(int j = 0 ; j < numberOfPlayers ; j++){
                players[j].receiveCard(dealer.dealCard());
            }
        }
        for(int i = 0; i < players.length; i++){
            System.out.print("Player " + (i + 1) + ": ");
            players[i].printHand();
            evaluateHand(players[i].getHand());
;
        }
    }
    public static void evaluateHand(List<Card> hand){
        List<Integer> rankCount = new ArrayList<>();
        for(int i = 0; i < 15;i++){
            rankCount.add(0);
        }
        for(Card card : hand){
            int rankValue = card.getRankValue();
            rankCount.set(rankValue, rankCount.get(rankValue) + 1);
        }
        boolean onePair = false;
        boolean twoPair = false;
        boolean triple = false;

        int pairCount = 0;

        for(int count : rankCount){
            if(count == 2){
                pairCount++;
            }
            else if(count == 3){
                triple = true;
            }
        }


        if(pairCount == 1){
            onePair = true;
        }
        else if(pairCount == 2){
            twoPair = true;
        }
        
        if(triple){
            System.out.println("Triple");
        }
        else if(onePair){
            System.out.println("One pair");
        }
        else if(twoPair){
            System.out.println("Two pair");
        }
        else{
            System.out.println("No pair");
        }

    }

}