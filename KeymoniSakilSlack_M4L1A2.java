/* Author: Keymoni Sakil-Slack
 * Date: September 27, 2018
 * Version: 1
 * Program Description: This program that determines your weight on Mars
 * What I learned from this program: I learned how to apply and implement the Scanner Class and objects, and methods into code.
 * What difficulties did I have and how I solved them: I not encounter any problems while developing this code.
*/

import java.io.*;
import java.util.*;

public class KeymoniSakilSlack_M4L1A2
{
   /***************************************************************
   * This is the main method which makes use of scanner class methods and objects.
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
        //Create a constant for Mars
        final double MARS = 0.38;
        
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //Prompt for name
        System.out.print("Type your name: ");
        String name = input.nextLine();
        //Prompt for weight
        System.out.print("Type your weight (on earth): ");
        double weight = input.nextDouble();
        
        //Convert to equivalent weight on Mars
        double weightMars = (weight/10)*(MARS*10);
        
        //Display the output
        System.out.println( name + "'s weight on Earth is " + weight + " lbs\nand weight on Mars is " + weightMars + " lbs.");
    }
}
/* Sample Output:
 * Type your name: Keymoni Sakil-Slack
 * Type your weight (on earth): 135
 * Keymoni Sakil-Slack's weight on Earth is 135.0 lbs
 * and weight on Mars is 51.3 lbs.
 */