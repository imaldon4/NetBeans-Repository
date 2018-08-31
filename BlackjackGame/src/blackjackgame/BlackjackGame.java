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
        
        while(hand <= 21){
            //prompt if wants to hit
            //generate a card number
            //display card number
            //add card to hand --> if hand is over 21 display bust
            //exit while loop
            //prompt if want to try again.
            //reset hand to zero
        }
    }
    
}
