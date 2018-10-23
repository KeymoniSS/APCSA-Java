/* Author: Keymoni Sakil-Slack
 * Date: October 10, 2018
 * Version: 1
 * Program Description: This program is used to find x in a given equation using if-else decision making. 
 * What I learned from this program: I learned how to apply Basic if-elses concepts into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L4PA

{
   /***************************************************************
   * This is the main method which makes use of if-else concepts
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {
     //Create Scanner class
     Scanner input = new Scanner(System.in);
     
     //Prompt the user to input for both "A" and "B"
     System.out.print("Enter A: ");
     double a = input.nextDouble();
     System.out.print("Enter B: ");
     double b = input.nextDouble();
     
     //To find x divide "b" by "a" and multiply but -1
     double x = (b / a) * -1;
     
     String strA= String.format("%.2f", a);
     String strB= String.format("%.2f", b);
     String strX= String.format("%.2f", x);
     
     //Declare if-else statments
     if(a == 0 && b == 0)
     {
         System.out.println(strA + "x +"+ strB + " --> There are infinite solutions.");
     }
     else if (a == 0 && b != 0)
     {
         System.out.println(strA + "x +"+ strB + " --> There are no solutions");
     }
     else
     {
        System.out.println(strA + "x +"+ strB + " -->x = " + strX); 
     }
    }
}
/* Sample Output:
 * 
 * Enter A:  4
 * Enter B:  -5
 * 4x + -5 = 0-->x = 1.25
 *
 * Enter A:  7
 * Enter B:  12
 * 7x +12 = 0-->x = -1.71429
 *
 * Enter A:  0
 * Enter B:  0
 * 0x +0 = 0-->There are infinite solutions
 *
 * Enter A:  0
 * Enter B:  7
 * 0x +7 = 0-->There are no solutions

 */