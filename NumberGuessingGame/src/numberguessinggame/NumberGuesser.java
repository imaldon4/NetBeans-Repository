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
        //introduce program
        JOptionPane.showMessageDialog(null, "Welcome! I will guess " +
                "the number you're thinking of.");
        
        JOptionPane.showMessageDialog(null, "Think of any number from 1 to 100.\n" +
                "I bet I can guess it!");
        
        
        String input;
        char response;
        int highPoint = 100; //initialize high and low points
        int lowPoint = 1;
        int answer;
        answer = getMidpoint(lowPoint, highPoint); //create first midpoint
        
        
        do{
            
            response = getUserResponseToGuess(answer);
            if(response == 'l'){
               answer = getMidpoint(highPoint, answer);
               
            }else if (response == 'h'){
                answer = getMidpoint(lowPoint, answer);
                
            }else if (response == 'c'){
                JOptionPane.showMessageDialog(null, "The number you're thinking of is: " + answer);
                
            }else{
                JOptionPane.showMessageDialog(null, "Invalid answer");
            }
        }while(response != 'c');
    }
    
/**
     * @param none This method will take the user's response 
     * and assign it to a variable response
     * @return response
     */
    public static char getUserResponseToGuess(int guess){
        char userInput;
        String input;
        int passGuess = guess;
        //invoke getUserResponse Method
                    //confirm
            input = JOptionPane.showInputDialog("Is it: " + passGuess + "(h/l/c)");
            //convert string input to integer
            userInput = input.charAt(0);
            //return an integer value corresponding to what the user entered  
        return userInput;          
    }
          
        
    /**
     * @param none or bool
     * @return boolean This will return false if wants to play again
     * 
     */
    public static boolean shouldPlayAgain(){
        
        //enter break statments
        String answer;
        answer = JOptionPane.showInputDialog("Would you like to pay again? (y/n)");
        char confirm = answer.charAt(0);
        
        if(confirm == 'y'){
            return false;
        } else{
            JOptionPane.showMessageDialog(null, "Bye");
            return true;
        }
        
    }
    
    public static int getMidpoint(int low, int high){
        
        int div;
        
        div = high - low;
        return div;
        
    }
}
   
