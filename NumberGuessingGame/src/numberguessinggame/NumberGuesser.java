/*
 * This program is a number guessing game that will guess
 * the number the user is thinking of.
 */
package numberguessinggame;
import java.util.Random;
import javax.swing.JOptionPane;     //import JOptionPane class library
/**
 * @version 09/05/18
 * @author Ike Maldonado
 */
public class NumberGuesser {

    /**
     * @param args the command line arguments
     * This will be the main method.
     */
    public static void main(String[] args) {
        //call first method under do-while loop
        do {
            playOneGame();
        } while (shouldPlayAgain());
    }
    
    /**
     * @param args none
     * This method will execute the playOneGame method, which should
     * display a JOptionPane box for the user to input.
     * There should be three conditions: high, low, and correct. These 
     * will be captured as loops.
     */
    
    public static void playOneGame(){
        //No arguments passed through playOneGame, hence empty ();
        
        //display game intro
        //capture user input
        //loop if not correct
        //once correct ask to play again
        //exit program
        int response;
        String input;

        //invoke getUserResponse Method
        response = getUserResponseToGuess();

        //Validate converted input within domain of 1 and 100
        do{
            if(response >= 1 && response <= 100){

                //proceed to game method
                
                

            } else{
                input = JOptionPane.showInputDialog("Out of range, please choose another number: ");
                response = Integer.parseInt(input);
            }
        }while(response < 1 && response > 100);
        
        
    }
    
    /**
         * @param none This method will take the user's response 
         * and assign it to a variable response
         * @return response
         */
        public static char getUserResponseToGuess(){
            String input;
            char convert;
            
            Random rand = new Random(midpoint());

            //Display game introduction and request input
            JOptionPane.showMessageDialog(null, "Welcome! This game will guess" +
                    " the number you're thinking of.");
            input = JOptionPane.showInputDialog("Is it: " + rand + "?");
            //convert string input to integer
            convert = input.charAt(0);
            //return an integer value corresponding to what the user entered
            return convert;          
        }
    
    /**
     * @param Num   This is the convert number
     * 
     * This is the primary body of calculation for the game
     */
    public static void game(int, Num){
        char higher = 'h';
        char lower = 'l';
        char correct = 'c';
        
        
    }    
    /**
     * @param none or bool
     * will return boolean value to original main method
     */
    public static boolean shouldPlayAgain(char, value){
        
        //enter break statments
        case: 'n'
        return false;
        case: 'y'
        return true;
        default:
        //print invalid answer and exit program
    }
}
