/* 
/* Author: Keymoni Sakil-Slack
 * Date: September 25, 2018
 * Version: 2
 * Program Description: In this program I used the quadratic formula to find the roots of a quadratic equation of the form  ax2 + bx +c = 0 given a, b and c. 
 * What I learned from this program: I learned how to apply and implement the Scanner Class, Math class methods, and objects into code.
 * What difficulties did I have and how I solved them: I not encounter any problems while developing this code.
*/

import java.io.*;
import java.util.*;

public class KeymoniSakilSlack_M4L1PAYourRoots

{
   /***************************************************************
   * This is the main method which makes use of Math class methods.
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    
   public static void main(String args[])
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter values for a, b, and c.
        System.out.println("Type in values for the variables a, b, and c ");
       
        //Assign a, b, and c to recieve input
        //Set as double to support values including decimals
        System.out.print("Type in the value for \"a\": ");
        double a = input.nextDouble();
        System.out.print("Type in the value for \"b\": ");
        double b = input.nextDouble();
        System.out.print("Type in the value for \"c\": ");
        double c = input.nextDouble();
        
        //*Equation is: ax^2 + bx +c = 0  
    
        //positive computation
        double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);   
        //negative computation
        double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);    
 
        //Display output for the equation
        System.out.println("Quadratic Equation Solver ");    
        System.out.println("If a, b and c are " + a + ", " + b + ", and " + c + ", the roots are  " + x1 + " and "+ x2); //use conactentation to display both plus and minus 
        
        /* If prsentented with a "NaN" or "Not-A-Number" result make not of the following: 
        * This is due to one or both roots/x's being an imaginary number/unit.
        * This is defined by its property i^2 = -1.
        * This code is not yet suited to support non-real answers.
        */
    }
}
/* Sample Output:
 * Quadratic Equation Solver
 * If a, b and c are 1, 1 and -2, the roots are 1.0 and -2.0
 */