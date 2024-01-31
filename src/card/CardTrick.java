/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * Name - Devinder Chand
 * Student no. - 991717596
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Devinder Chand
 * @jan 30th
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomNumber()); // call to random number generator
            c.setSuit(Card.SUITS[generateRandomNumberBetween(0, 3)]); // call to random number between 0-3
            magicHand[i] = c;

            // Print the generated card
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        Scanner scanner = new Scanner(System.in);

        // insert code to ask the user for Card value and suit
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        // create their card and search magicHand here
        boolean isUserCardInMagicHand = false;
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
            if (card.equals(userCard)) {
                isUserCardInMagicHand = true;
                break;
            }
        }

        // Then report the result here
        if (isUserCardInMagicHand) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // add one lucky card hard-coded (2 of clubs)
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Display the lucky card
        System.out.println("Lucky Card: " + luckyCard.getSuit() + " " + luckyCard.getValue());

        // Search for the lucky card in magicHand
        boolean isLuckyCardInMagicHand = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                isLuckyCardInMagicHand = true;
                break;
            }
        }

        // Report the result for the lucky card
        if (isLuckyCardInMagicHand) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }

        // Continue with the rest of the steps...
    }

    private static int generateRandomNumber() {
        // Implement your logic to generate a random number
        // For simplicity, you can use Java's built-in random number generator
        return (int) (Math.random() * 13) + 1; // Generates a random number between 1 and 13
    }

    private static int generateRandomNumberBetween(int min, int max) {
        // Implement your logic to generate a random number between min and max (inclusive)
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
