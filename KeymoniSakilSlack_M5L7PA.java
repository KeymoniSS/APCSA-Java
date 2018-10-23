/* Author: Keymoni Sakil-Slack
 * Date: October 18, 2018
 * Version: 1
 * Program Description: This program is used to practice and create  an understanding of random integers and numbers.
 * What I learned from this program: I learned how to apply random integers and numbers into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L7PA

{
   /***************************************************************
   * This is the main method which makes use of random integers and numbers
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {

     
     //Create random method
     Random rndm = new Random();
     
     /* //Lesson30 part1
      
     for(int j = 0; j <100; j++)
     {
         System.out.println(rndm.nextDouble());
         
         Integar example
         System.out.println(rndm.nextInt(20));
         This '20' will generate numbers from 0 through 19
     }
     */
     
    /* Lesson30 part2
     int rInt = 0;
     for(int j = 0; j < 100; j++)
     {
     //Generate numbers in the range from 90 to 110 inclusive
     //110 - 90 = 20
     rInt = 90 + rndm.nextInt(21);
     
     System.out.println(rInt);
     }
     */
    
     //Lesson30 part3
     double d = 0;
     for(int j = 0; j < 100; j++)
     {
     //Generate numbers in the range from 34.7838(inclusive) to 187.056(exclusive)
     //187.056 - 34.7838 = 152.2722
     
     d = 34.7838 + 152.2722 * rndm.nextDouble();
     
     System.out.println(d);
     }
}
}
/* Sample Output (Lesson30 part 3);
48.16475660136881
40.71232143270814
56.72343611963457
95.04564807257364
97.46036843522573
147.9797132238197
89.77495473990828
178.24663833046657
88.57693846910604
155.00032228365484
89.42864194485887
144.45296930893636
141.29366370307702
159.10865535894598
81.19945314956635
178.13790094949735
.......

 */