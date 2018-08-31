/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;
import java.util.*;
/**
 *
 * @author imald
 */
public class BlackjackGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String answer;
        char yesNo;
        int hand = 0;
        
        //introduce the game
        System.out.println("Let's play Blackjack!");
        //ask if wants to play
        System.out.println("Would you like to play? (y/n): ");
        answer = input.nextLine();
        yesNo = answer.charAt(0);
        
        while(yesNo == 'y'){
            while(hand <= 21){
                int card;
                int total = 0;
                
                //provide user with first card, then display
                card = random.nextInt(11);
                total += card;  //start aggregating the cards
                System.out.println("Your first card is: " + card);
                
                //provide user with the second card, then display
                card = random.nextInt(11);
                total += card;  //aggregating cards
                System.out.println("Your second card is: " + card);
                System.out.println("Both cards total: " + total);
                
                System.out.println("");
                System.out.println("Would you like to hit or stay? (h/s)");
                answer = input.nextLine();
                yesNo = answer.charAt(0);
                
                if (yesNo == 'h'){
                    card = random.nextInt(11);
                    total += card;
                    if (total > 21){
                        System.out.println("BUST!");
                    }
                    else {
                        System.out.println("Cards total: " + total);
                        System.out.println("Would you like to hit or stay? (h/s)");
                    }
                }
                else {
                    //thank you for playing
                }
              
        }
    
        }
    }
    
}
