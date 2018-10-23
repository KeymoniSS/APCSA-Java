//KeymoniSakilSlack_M5L1A
/* Author: Keymoni Sakil-Slack
 * Date: October 4, 2018
 * Version: 1
 * Program Description: This program is used to determine the insurance cost for automobile drivers.
 * What I learned from this program: I learned how to apply boolean concepts and if/else-ifs/else functions into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L1A
{
   /***************************************************************
   * This is the main method which makes use of boolean concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
        //Declare variable
        int cost = 0;
        
        System.out.println("Welcome to Insurance Company Inc. ");
        System.out.println("----------------------------------------------------------");
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Prompt user for keyboard input
        System.out.print("To calculate insurance cost please enter driver's age: ");
        int age = input.nextInt();
         System.out.print("----------------------------------------------------------\n");
        
        //Calculate insurance rate per age demographic
        if (age >= 16 && age < 18) {
            cost = age * 88;
            System.out.println("Driver age = " + age);
            System.out.println("Insurance cost = $" + cost);
            System.out.println("\nThank you, come again!");
        }
        else if (age >= 18 && age <25){
            cost = age * 72;
            System.out.println("Driver age = " + age);
            System.out.println("Insurance cost = $" + cost);
            System.out.println("\nThank you, come again!");
        }
        else if (age >= 25){//After you hit 25 the inurance cost is $500
            cost = 500;
            System.out.println("Driver age = " + age);
            System.out.println("Insurance cost = $" + cost);
            System.out.println("\nThank you, come again!");
        }
        else{
            System.out.println("You do not meet the criteria to recieve an insurance quote from this company.");
            System.out.println("You must be 16 and older to recieve information.\nPlease come back when you successfully reached the company's specifications. \n\nThank you, come again!");
        }
    }
}
/* Sample Output:
 * Welcome to Insurance Company Inc. 
----------------------------------------------------------
To calculate insurance cost please enter driver's age: 17
----------------------------------------------------------
Driver age = 17
Insurance cost = $1496

Thank you, come again!
 */
