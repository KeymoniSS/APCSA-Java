/* Author: Keymoni Sakil-Slack
 * Date: September 18, 2018
 * Version: 1
 * Program Description: This program will calculate my cell phone bill
 * What I learned from this program: I learned how to apply casting to my final calculation variable converting it from one data-type to another, temporaily.  
 * What difficulties did I have and how I solved them: I had no difficulties during this assignment.
 */
public class KeymoniSakilSlack_M3L4A
{
    public static void main(String args[])
    {
    //Declare Variables
    double dataOverRate, cost, totalBill;
    //Declare constants
    
    final double DATA_COVERAGE_FEE = 50; //The monthly base rate aka the Data coverage fee (This covers unlimited talk and text as well as 5MB) is $50
    final double TAX_RATE = 1.0534; //The "1" refers to 100% of the item cost (1 + tax rate)
    
    //Rate for data over fee is .50 for every MB over 5MB which in this instance is 17
    dataOverRate = .50 * 17; 
    
    //Cost is the original cost without applying the tax rate
    cost = DATA_COVERAGE_FEE + dataOverRate;//Should be about 58.5
    
    //Once the cost is calculated multiply it with the tax rate to get the totalBill
    totalBill = cost * TAX_RATE;
    
    System.out.println("My cell phone bill should be $" + (int)totalBill);    
    }
}
/* Sample Output:
 * My cell phone bill should be $61
 * 
 */