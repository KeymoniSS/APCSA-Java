f/* Author: Keymoni Sakil-Slack
 * Date: October 10, 2018
 * Version: 1
 * Program Description: This program can find the final price of a customers's purchases wile incorpating sale rates.
 * What I learned from this program: I learned how to apply multiple if-elses concepts into code. 
 * What difficulties did I have and how I solved them: Initially, my output would not display. The problem lied within my formatting for the "Discount"
 * I learned that in order to have a "%" display with your output you would need to enter the symbol twice.
 * After I did that my code computed fine.
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class KeymoniSakilSlack_M5L3A2
{
   /***************************************************************
   * This is the main method which makes use of if-else concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
    //Create Constants
    final double TAX_RATE = .06;
    final double DISCOUNT1 = .10;
    final double DISCOUNT2 = .20;
    
    //Create a scanner class
    Scanner input = new Scanner(System.in);
    
    //Initialize and declare variables
    double purchases = 0;
    double sum = 0;
    double discount = 0;
    double taxPrice = 0;
    double salePrice = 0;
    
    //Introduce user to the program
    System.out.println("Welcome to our Super Sale!");
    System.out.println("All local stores are participating in this community-wide fall sale!\n");
    System.out.println("To find out how much you saved during this autumnal event, please enter your purchases amount below...\n");
    System.out.println("Note: Enter '0' to stop entering numbers");
    System.out.println("-------------------------------------------------------------------------------------------------------\n");
    System.out.print("Enter a purchase amount: $");
// To ask for multiple purchases, a condition was set. If a user input is over 0 then that number gets added to the sum.
    while ((purchases = input.nextDouble()) > 0 ){
     System.out.print("Enter another purchase amount: $");
     sum += purchases;
    }
        
    taxPrice = sum * TAX_RATE;
    
// Create the conditions to determine what discount does an customer get
    if(sum <= 100)
        {
        discount = sum * DISCOUNT1;
        salePrice = sum - discount;
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.printf("Purchase Price:\t\t $%4.2f\n", sum);
        System.out.printf("Discount (10%%):\t\t $%4.2f\n", discount);
        System.out.printf("Sale Price:\t\t $%4.2f\n", salePrice);
        System.out.printf("Tax:\t\t\t $%4.2f\n", taxPrice);
        System.out.printf("Final Price:\t\t $%4.2f\n", (salePrice + taxPrice));
        }
       else //(purchases > 100)
        {
        discount = sum * DISCOUNT2;
        salePrice = sum - discount;
        System.out.println("\n");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n");
        System.out.printf("Purchase Price:\t\t $%4.2f\n", sum);
        System.out.printf("Discount(10%%):\t\t $%4.2f\n", discount);
        System.out.printf("Sale Price:\t\t $%4.2f\n", salePrice);
        System.out.printf("Tax:\t\t\t $%4.2f\n", taxPrice);
        System.out.printf("Final Price:\t\t $%4.2f\n", (salePrice + taxPrice));
       }
       
       System.out.println("\n\nThank you, come again!");
}
}
/* 
Welcome to our Super Sale!
All local stores are participating in this community-wide fall sale!

To find out how much you saved during this autumnal event, please enter your purchases amount below...

Note: Enter '0' to stop entering numbers
-------------------------------------------------------------------------------------------------------

Enter a purchase amount: $55
Enter another purchase amount: $.25
Enter another purchase amount: $0

-----------------------------------------------------------

Purchase Price:		 $55.25
Discount (10%):		 $5.53
Sale Price:		 $49.73
Tax:			 $3.32
Final Price:		 $53.04


Thank you, come again!
 * 
 */