/* Author: Keymoni Sakil-Slack
 * Date: October 2, 2018
 * Version: 1
 * Program Description: This program computes an electric bill and prints it out.  
 * What I learned from this program: I learned how to apply formating and rounding concepts into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.text.*;
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M4L3A
{
    /***************************************************************
   * This is the main method which makes use of Scanner classes and formatting concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
        //Assign constants
        final double COST = .0425;
        final double SURCHARGE = .10;
        final double CITY_UTILITY = .03;
        final double PENALITY = 1.04;
        
        //Optional: Set Today's date to mimic a time's stamp
        Date today = Calendar.getInstance().getTime();
        
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Prompt User for keyboard input
        System.out.print("Enter KWH used: ");
        double kwh = input.nextDouble();
        
        //Calculate functions
        double baseCharge = kwh * COST;
        double surCharge = baseCharge * SURCHARGE;
        double cityTax = baseCharge * CITY_UTILITY;
        double total = baseCharge + surCharge + cityTax;
        double intrest = total * PENALITY;
        
        //Change double to integar
        int value = (int) kwh;
        
        //Display Output for rounding and formatting
        System.out.println("\n" + today + "\n");
        System.out.printf("%40s", "APCS Electric\n");
        System.out.println("----------------------------------------------------------");
        System.out.printf("Kilowatts Used\t\t\t\t  " + value + " @ $%-5.4f\n",COST);
        System.out.println("----------------------------------------------------------");
        System.out.printf("Base Charge\t\t\t\t\t $%4.2f\n",baseCharge);
        System.out.printf("Surcharge\t\t\t\t\t $%4.2f\n",surCharge);
        System.out.printf("Citytax\t\t\t\t\t\t $%4.2f\n",cityTax);
        System.out.printf("%55s\n","______");
        System.out.printf("Pay this amount\t\t\t\t\t $%4.2f\n",total);
        System.out.printf("After Oct 20th Pay \t\t\t\t $%4.2f\n",intrest);
    }
}
/*
 *              APCS  Electric
------------------------------------------------
Kilowatts Used 	     997 @ $  0.0425
------------------------------------------------
Base Charge          		$  42.37
Surcharge           		$   4.24
Citytax                    	$   1.27
                                 ______
 
Pay this amount          	$  48.88
 
After May 20th Pay      	$  50.84
 */