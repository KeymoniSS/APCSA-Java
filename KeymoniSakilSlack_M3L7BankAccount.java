/* Author: Keymoni Sakil-Slack
 * Date: September 24, 2018
 * Version: 1
 * Program Description: This program will display the balance of a bank account with a withdraw and desposit function.
 * What I learned from this program: I learned how to apply and implement Classes, Methods, and Objects into code.
 * What difficulties did I have and how I solved them: I did encounter a few problems while developing this code. In many cases I had forgotten to add the "()" to the end of methods when testing which would 
 * compute an error when I tried to complie. Another error I made was when I tried to do the println method instead of putting "myAccount.getBalance()" I would put "getBalance" which of course gave me a syntax error.
 * After I applied the appropiate endings and println statements my code complied fine.
 */

//Class Declaration
public class KeymoniSakilSlack_M3L7BankAccount
{
    //Instance Variables
    public double balance;
    public String name;
    
    //Constructor Declaration of Class
    public KeymoniSakilSlack_M3L7BankAccount(double initialBalance, String accountHolder)
    { 
        //This constructor has two parameters, initialBalance and accountHolder
        
        //double b = balance; This is how much money is currently in the account
        balance = initialBalance;
        
        //The name of the person owning the account
        name = accountHolder;
        
    }
    /************************************************************
     * Method: getName  - This gets the first and last name of the account holder
     * @return - This returns the account holder's name
     ***********************************************************/
    public String getName()
    {
        return name;
    }
    /************************************************************
     * Method: getBalance  - This gets the current balance of the account holder
     * @return - This returns the current balance of a bank account with withdraw and deposit functions in mind
     ***********************************************************/
    public double getBalance()
    {
        return balance;
    }

    //Method 1:
    /************************************************************
     * Method: deposit - accepts a double that is the amount of money being deposited
     * @param amount - This the the number amount of how much total is going to be added to the balance (the deposit) to produce a new balance. You would add this to the balance.
     * @return - Nothing is returned 
     ***********************************************************/
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    //Method 2:
    /************************************************************
     * Method: deposit - accepts a double that is the amount of money being taken out of the account
     * @param amount - This the the number amount of how much total is going to be taken away from the balance (the withdraw) to produce a new balance. You would subtract this from the balance. 
     * @return - Nothing is returned 
     ***********************************************************/
    public void withdraw (double amount)
    {
        balance = balance - amount;
    }
    
    
}