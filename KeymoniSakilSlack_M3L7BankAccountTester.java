/* Author: Keymoni Sakil-Slack
 * Date: September 24, 2018
 * Version: 1
 * Program Description: This program will display the balance of a bank account with a withdraw and desposit function.
 * What I learned from this program: I learned how to apply and implement Classes, Methods, and Objects into code.
 * What difficulties did I have and how I solved them: I did encounter a few problems while developing this code. In many cases I had forgotten to add the "()" to the end of methods when testing which would 
 * compute an error when I tried to complie. Another error I made was when I tried to do the println method instead of putting "myAccount.getBalance()" I would put "getBalance" which of course gave me a syntax error.
 * After I applied the appropiate endings and println statements my code complied fine.
 */

public class KeymoniSakilSlack_M3L7BankAccountTester

{
    public static void main(String args[])
    {
       KeymoniSakilSlack_M3L7BankAccount myAccount = new KeymoniSakilSlack_M3L7BankAccount(1000.0, "Sally Jones");
       
       //Call the deposit method to deposit $505.22 or any other amount
       myAccount.deposit(505.22);
       //Display the balance
       System.out.println("Your current balance is: $" + myAccount.getBalance());
       //Call the withdraw method to withdraw $100 or any other amount
       myAccount.withdraw(100.00);
       //Display the remaining balance
       System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
 
    }
}
/* Sample Output:
 * Your current balance is: $1505.22
 * The Sally Jones account balance is, $1405.22
 */