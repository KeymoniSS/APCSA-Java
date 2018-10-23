/* Author: Keymoni Sakil-Slack
 * Date: October 9, 2018
 * Version: 1
 * Program Description: This program is used to practice testing for multiple uses of if-else statements
 * What I learned from this program: I learned how to apply multiple if-elses concepts into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L3PA
{
   /***************************************************************
   * This is the main method which makes use of if-else concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
     final double TAX_RATE = .06;
     Scanner input = new Scanner(System.in);

     double purchases = 0;
     double sum = 0;

     while (true) {
    System.out.println("Enter done to stop entering numbers");
    System.out.print("enter number: ");
    String ans = input.next();
    while (!ans.equals("done")) {

        purchases = Double.parseDouble(ans);

        sum += purchases;

        System.out.print("enter number: ");

        ans = input.next();
    }
   
   double taxPrice = sum * TAX_RATE;
   if(sum <= 100)
        {
        double discount = sum * .10;
        double salePrice = sum - discount;
        System.out.println("Purchase Price:\t $" + sum);
        System.out.println("Discount(10%):\t $" + discount);
        System.out.println("Sale Price:\t $" + salePrice);
        System.out.println("Tax:\t\t $" + taxPrice);
        System.out.println("Final Price:\t $" + (salePrice + taxPrice));
        }
       else //(purchases > 100)
        {
        double discount = sum * .20;
        double salePrice = sum - discount;
        System.out.println("Purchase Price:\t $" + sum);
        System.out.println("Discount(20%):\t $" + discount);
        System.out.println("Sale Price:\t $" + salePrice);
        System.out.println("Tax:\t\t $" + taxPrice);
        System.out.println("Final Price:\t $" + (salePrice + taxPrice));
       }

}
}
}