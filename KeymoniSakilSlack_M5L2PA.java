/* Author: Keymoni Sakil-Slack
 * Date: October 9, 2018
 * Version: 1
 * Program Description: This program is used to practice testing for the basic if-else decision making 
 * What I learned from this program: I learned how to apply Basic if-elses concepts into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L2PA
{
   /***************************************************************
   * This is the main method which makes use of if-else concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
     //Create Scanner class
     Scanner input = new Scanner(System.in);
     //Prompt the user to input their grade
     System.out.print("What is your grade? ");
     int myGrade = input.nextInt();
     
     //Declare if-else statments
     if(myGrade >= 70)
     {
         System.out.println("Congratulations, you passed!");
     }
     else
     {
         System.out.println("Better luck next time!");
     }
    }
}
/* Sample Output:
 * 
 * What is your grade? 86
 * Congratulations, you passed!
 * 
 * What is your grade? 60
 * Better luck next time!
 */