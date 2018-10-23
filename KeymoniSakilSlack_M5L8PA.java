/* Author: Keymoni Sakil-Slack
 * Date: October 22, 2018
 * Version: 1
 * Program Description: This program is used to practice testing for equlity using Boolean operaters
 * What I learned from this program: I learned how to apply inputted data and boolean operateors into code.
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */
import java.io.*;
import java.util.*;
public class KeymoniSakilSlack_M5L8PA

{
   /***************************************************************
   * This is the main method which makes use of the scanner class and inputting data
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[]) throws FileNotFoundException
    {

     //Scanner sf = new Scanner(new File("myData.in") );
     Scanner sf = new Scanner(new File("NumData.in") );
     
     int maxIndx = -1;
     String text[] = new String[100];
     
     while(sf.hasNext())
     {
         maxIndx++;
         text[maxIndx] = sf.nextLine();
         //System.out.println(text[maxIndex]);
     }
     sf.close();
     
     String answer = "";
     int sum = 0;
     for(int j = 0; j <= maxIndx; j++)
     {
         Scanner sc = new Scanner(text[j]);
         sum = 0;
         answer = "";
         
         while(sc.hasNext())
         {
            int i = sc.nextInt();
            answer = answer + "+" + i;
            sum = sum + i;
         }
         answer = answer + "=" + sum;
         System.out.println(answer);
     }
    
}
}
/* Sample Output;
+12+10+3+5=30
+18+1+5+92+6+8=130
+2+9+3+22+4+11+7=58
+12+10+3+5=30
+18+1+5+92+6+8=130
+2+9+3+22+4+11+7=58
 */