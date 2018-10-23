
/* Author: Keymoni Sakil-Slack
 * Date: September 18, 2018
 * Version: 1
 * Program Description: The program displays how many total mints there are, how many total bags you can make out of a given number of mints in each bag, and how many mints are left over.
 * What I learned from this program: I learned how to apply both types of division into code
 * What difficulties did I have and how I solved them: I wasn't presented with any difficulties during this projected. Everything complied fine.
 */
public class KeymoniSakilSlack_M3L3A
{
    public static void main(String args[])
    {
        //This statement displays the output
        int totalMints, numberOfBags, mintsLeftOver;
        totalMints = 500;
        numberOfBags = totalMints/3; //I used regular division here to determine how many times 3 mints can go into a bag. The answer: 166 times
        mintsLeftOver = totalMints%numberOfBags; // I used modular division to determine the remainder(how many mints are left) coinciding with the previous statement
        
        //Display results
        System.out.println("Total Mints = " + totalMints);
        System.out.println("Number of Bags = " + numberOfBags);
        System.out.println("Mints Leftover = " + mintsLeftOver);
    }
}
/* Sample Output:
 * Total Mints = 500
 * Number of Bags = 166
 * Mints Leftover = 2
 * 
 */ 