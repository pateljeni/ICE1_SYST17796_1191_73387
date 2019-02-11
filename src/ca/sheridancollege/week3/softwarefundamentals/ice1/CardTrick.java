/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Jeni Patel
 * @modifier name: Jeni Patel Student Number: 991513801
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Card[] magic = new Card[7];
         int card;
        String suit ="";
        Scanner scr = new Scanner(System.in);
        for (int i=0; i<magic.length; i++)
        {
            Card c = new Card();
            int val;
            String su;
            c.setValue(rand.nextInt((13 - 0) + 1) + 0);
            c.setSuit(Card.SUITS[rand.nextInt(3) + 0]);
            magic[i]=c;
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        boolean check = false;
         System.out.println("Pick Card: ");
        card = scr.nextInt();
        System.out.println("Suit: ");
        suit = scr.next();
         for (int i=0; i<magic.length; i++)
        {
           int first= magic[i].getValue();
           String second=magic[i].getSuit();
           if(card ==  first && suit.equals(second))
            {
                check = true;

            }      
        }
         if(check == true)
                System.out.println("Your card is the lucky card");
           else
                System.out.println("Sorry better luck next time");
        
    }
}

