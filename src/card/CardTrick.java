package card;

import java.util.Random; // Import Random for random number generation
import java.util.Scanner; // Import Scanner for user input

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *  Modified by Neel Patel.
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random(); // Initialize Random
        
        // Fill the magicHand array with random cards and print them
        System.out.println("Magic Hand:");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Generate a random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Generate a random suit index between 0 and 3
            magicHand[i] = c;
            System.out.println(c.toString()); // Print each randomly generated card using toString
        }
        
        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter your card suit (0 for hearts, 1 for diamonds, 2 for clubs, 3 for spades): ");
        int userSuit = scanner.nextInt();
        
        // Create the user's card
        Card cards = new Card();
        cards.setValue(userValue);
        cards.setSuit(Card.SUITS[userSuit]);
        
        // Search magicHand for the user's card
        for (Card card : magicHand) {
            if (card.getValue() == cards.getValue() && card.getSuit().equals(cards.getSuit())) {
                System.out.println("CONGRATULATIONS YOUR CARD IS IN MAGIC HAND");
                break;
            }
            else{
                System.out.println("OOPS! YOUR CARD IS IN MAGIC HAND");
                break;
            }
        }

        
        // Add one lucky card (hard-coded 2 of clubs)
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]); // 2 corresponds to clubs
    }
    
}
