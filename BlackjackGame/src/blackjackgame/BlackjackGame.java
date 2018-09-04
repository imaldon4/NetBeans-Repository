package blackjackgame;
import java.util.*;
/**
 * This class creates a program that plays Blackjack.
 * @author Ike Maldonado
 * @version 08/31/18
 */
public class BlackjackGame {

    /**
     * This is where the main method resides.
     */
    public static void main(String[] args) {
        //Use the Random class to create a random object variable
        Random random = new Random();
        
        //Use the Scanner class to create a input object variable
        Scanner input = new Scanner(System.in);
        
        //Create variables
        String answer;      //--stores input strings
        char yesNo;         //--stores converted input strings as char
        int hand = 0;       //--holds total for current cards in hand
        int card = 0;       //--holds the random integer
        char hit;           //--stores char from user's request to hit
        
        //Introduce the game
        System.out.println("Let's play Blackjack!");
        System.out.println("*********************");
        
        //Without separate methods, we will be using do-while loops
        //to contain the entire program.
        do{ //--this do-while tests for 'y' if user wants to play again
            
            //tests to make sure random doesn't assign 0 to card
            do{ 
                card = random.nextInt(11);
            } while (card==0);
            
            //store the current value of card
            hand += card;
            System.out.println("Your first card is: " + card);
            
            //tests to make sure random doesn't assign 0 to card
            do{ 
                card = random.nextInt(11);
            } while (card==0);
            
            //'hand' store current value of card plus previous value
            hand += card;
            
            //display results
            System.out.println("Your second card is: " + card);
            System.out.println("This adds to: " + hand);
            System.out.println("This is under 21 so far. " +
                                "Would you like to hit? (y/n)");
            //take in user input and assign to char variable 'hit'
            answer = input.nextLine();
            hit = answer.charAt(0);

            //if user agreed to hit, proceeds to loop
            while(hit == 'y'){
                //tests to make sure random doesn't assign 0 to card
                do{
                card = random.nextInt(11);
                } while (card == 0);
                
                //add value of card to current hand
                hand += card;
                
                //test value of current hand total to see if it's under 21
                if (hand > 21){
                    System.out.println("Your total is: " + hand);
                    System.out.println("BUST!");
                    //assign 'n' value to hit to exit while loop
                    hit = 'n';
                }
                //if value of hand is less than 21 else initiates
                else {
                    System.out.println("Card is: " + card);
                    System.out.println("Your total is: " + hand);
                    System.out.print("Hit again? ");
                    
                    //take in user input in order to hit again or exit
                    answer = input.nextLine();
                    hit = answer.charAt(0);
                }
            }
            
            //prompt user to continue or exit do-while loop
            System.out.print("Would you like to play again? (y/n) ");
            answer = input.nextLine();
            yesNo = answer.charAt(0);
            //test user's response
            if (yesNo == 'y'){
                hand = 0;       //Need to assign values back to
                card = 0;       //zero if user plays again.
                System.out.println();   //aesthetic empty line
            }
        //tests user's answer in order to loop or exit
        }while (yesNo == 'y'); 
        
        //exit the game. Prompt a thank you.
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}
 
