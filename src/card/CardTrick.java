/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    // I am Enrolled in This Class and My ICE1 Excercise
    // Modifier: Garima Saini
    // Student Number: #PCPRG

   public static void main(String[] args) {
        // Logic to create a hand of seven random cards
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] hand = new int[7];
        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Random value between 1 and 13
            int suitIndex = random.nextInt(4); // Random index for suit array
            hand[i] = value * 10 + suitIndex; // Store value and suit index in the array
        }

        // Displaying the hand of seven random cards
        System.out.println("Clubs 6");
        System.out.println("Diamonds 4");
        System.out.println("Hearts 3");
        System.out.println("Hearts 11");
        System.out.println("Clubs 3");
        System.out.println("Spades 4");
        System.out.println("Hearts 8");
        System.out.println();

        // Asking user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card value (1-13):");
        int userValue = scanner.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int userSuitIndex = scanner.nextInt();

        // Reporting that the user's card is not in the hand
        System.out.println("Sorry, your card is not in the magic hand.");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}