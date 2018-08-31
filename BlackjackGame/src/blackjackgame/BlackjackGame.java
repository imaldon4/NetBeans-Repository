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
        int card = 0;
        int total = 0;
        char hit;
        //introduce the game
        System.out.println("Let's play Blackjack!");
        
        do{
            do{
                //provide user with first card, then display
                card = random.nextInt(11);
            } while (card==0);
            hand += card;
            System.out.println("Your first card is: " + card);

            do{
                card = random.nextInt(11);
            } while (card==0);
            hand += card;
            System.out.println("Your second card is: " + card);

            System.out.println("This adds to: " + hand);
            System.out.println("This is under 21 so far." +
                                "Would you like to hit? (y/n)");
            answer = input.nextLine();
            hit = answer.charAt(0);

            while (hand <= 21){
                while(hit == 'y'){
                    do{
                    card = random.nextInt(11);
                    } while (card == 0);

                    hand += card;
                    if (hand > 21){
                        System.out.println("Your total is: " + hand);
                        System.out.println("BUST!");
                        hit = 'n';

                    }
                    else {
                        System.out.println("Card is: " + card);
                        System.out.println("Your total is: " + hand);
                        System.out.print("Hit again? ");
                        answer = input.nextLine();
                        hit = answer.charAt(0);
                    }
                }
                hand += 21;
            }         
            System.out.print("Would you like to play again? (y/n) ");
            answer = input.nextLine();
            yesNo = answer.charAt(0);
            if (yesNo == 'y'){
                hand = 0;
                card = 0;
            }
        }while (yesNo == 'y');  
        
        System.out.println("Thanks for playing!");
        System.exit(0);
    
    }
}
 
