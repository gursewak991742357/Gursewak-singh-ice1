/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *@author ebaad
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1); // Generate a random card value (1-13)
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Generate a random suit (0-3)
            magicHand[i] = c;
        }
        
        // Add the luckyCard with card number 2 and suit "Clubs"
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        // Insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        // Then report the result here
    }
    
}
