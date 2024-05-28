/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier: [Gursewak Singh]
 * Date: [2024/05/27]
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        // Initialize the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // Card values from 1 to 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Suits: "Hearts", "Diamonds", "Spades", "Clubs"
            magicHand[i] = c;
        }

        // Print the cards in the magic hand
        System.out.println("Your magic hand:");
        for (Card card : magicHand) {
            System.out.println(card);
        }

        // Prompt the user to enter a card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int suitIndex = scanner.nextInt();
        String suit = Card.SUITS[suitIndex];
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        // Check if the card is in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The card " + userCard + " was found in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // Add one luck card hardcoded as 2 of Clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        System.out.println("The lucky card is: " + luckyCard);

        scanner.close();
    }
}
