/* Author: Keymoni Sakil-Slack
 * Date: September 27, 2018
 * Version: 2
 * Program Description: This program computes an add-on letter for an 8-digit number. 
 * What I learned from this program: I learned how to apply and implement the Scanner Class, the concept of Ascii codes, input methods, and objects into code.
 * What difficulties did I have and how I solved them: At first, I couldn't figure out how to change one character to another. I admit, I did struggle during this assignment. 
 * But after stepping back,and read-reading the assignment. It became clear that in order for me to change one code to another I needed to add a number. After I added the result
 * of the remainder to the interger value of the letter "A", my code complied fine.
 */

import java.io.*;
import java.util.*;

public class KeymoniSakilSlack_M4L2A2

{
   /***************************************************************
   * This is the main method which makes use of modulus functions and ascii code concepts.
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        int newTotal;
        
        //Get keyboard input(four diffrent integers) from user
        System.out.print("Enter the credit card number (XX XX XX XX): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        
        //Add the four-two digits values in the credit card number to get the sum
        int sum = num1 + num2 + num3 + num4;
        
        // Find the integer remainder of a division by 26
        int remainder = sum % 26;
        
        /* Add remainder to the the original letter to get a new letter
         * Ex: Add a remainder of 1 to the ascii code of "A" (65) to make 66 (the ascii code of "B")
        */
        char letter = (char)((int)'A' + remainder);
        
        //Display output
        System.out.println("The correct code and number is "+ num1 + " " + num2 + " " +  num3 + " " +  num4 + " " + (char)letter);
        
        }     
}
/* Sample Output:
 * Enter the credit card number (XX XX XX XX): 16 26 26 26
 * The correct code and number is 16 26 26 26 Q
 */