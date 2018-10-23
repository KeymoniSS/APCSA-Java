/* Author: Keymoni Sakil-Slack
 * Program name: KeymoniSakilSlack_M5L7A
 * Date: October 18, 2018
 * Version: 1
 * Description: This program is a guessing game that users can play. 
 * Difficulties: I expierenced no difficulties
 * Things learned: I learned how to appply my understandings of random integers into code while implementing a while method.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L7A
{
   /***************************************************************
   * This is the main method which makes use of random interger concepts and the scanner class.
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {        
        //Optional Introduction: Introduce the program to the user
        System.out.println("Let's play a guessing game!");
        System.out.println("The computer will randomly generate a number from 1 to 100 and it's your job to guess that number!");
        System.out.println("Are you ready?");
        System.out.println("Let's play!");
        System.out.println("------------------------------------------------------------------------------------------------------------------\n");
        
        //Set Variable(s)
        int userGuess = 0;
        
        //Create Scanner class
        Scanner input = new Scanner(System.in);
     
        //Create random method
        Random rand = new Random();
        int computerNum = rand.nextInt(100);

        //Counting loop to repeat if user does not guess correctly
        do
        {
         System.out.print("Choose a number between 1 to 100: ");
         userGuess = input.nextInt();
       
         System.out.println("Your guess is " + userGuess);

        if(userGuess < computerNum ) 
             System.out.println("Your guess should be higher!\nLet's try again.\n\n");
        else if(userGuess > computerNum )
             System.out.println("Your guess should be lower!\nLet's try again.\n\n");
        else if (userGuess == computerNum) {
             System.out.println("Your guess is correct!");
             System.out.println("The computer's number was " + computerNum + ".\n");
         }
    } while (userGuess != computerNum);
}//end while loop
}//end main method
//end class

/*Sample Output
 Let's play a guessing game!
The computer will randomly generate a number from 1 to 100 and it's your job to guess that number!
Are you ready?
Let's play!


Choose a number between 1 to 100: 65
Your guess is 65
Your guess should be lower!
Let's try again


Choose a number between 1 to 100: 45
Your guess is 45
Your guess should be lower!
Let's try again


Choose a number between 1 to 100: 35
Your guess is 35
Your guess should be lower!
Let's try again


Choose a number between 1 to 100: 20
Your guess is 20
Your guess should be lower!
Let's try again


Choose a number between 1 to 100: 10
Your guess is 10
Your guess should be lower!
Let's try again


Choose a number between 1 to 100: 2
Your guess is 2
Your guess is correct!
The computer's number was 2
 * 
 */
