/* Author: Keymoni Sakil-Slack
 * Program name: KeymoniSakilSlac_M5L6A
 * Date: October 16, 2018
 * Description: This program tests Ulam's Hypothesis for numbers 1-25 
 * Numbers 1-25 converge to 1 by these rules: If odd, multiply by 3 and add 1. If even, divide by 2.
 * 
 * Difficulties: I expierenced no difficulties
 *  
 * Things learned: I learned how to appply my understandings of if-else methos into code.
 */

public class KeymoniSakilSlack_M5L6A
{
   /***************************************************************
   * This is the main method which makes use of if-else concepts.
   * @param args Unused.
   * @return Nothing.
   ***************************************************************/
    public static void main(String args[])
    {        
        //Set Variables
        int num;
        int result;
        
        //Counting loop to repeat for 2-25
        for (num = 1; num <= 25 ; num++)
        {
            //Reset result to num
            result = num;
            
            //Print the first number of the sequence.
            System.out.print(result + ":  ");
            
            //Result controlled loop: keeps doing calculations and printing the sequence until 1 is reached
            do
            {
              //If it's even divide by 2
              if(result % 2 == 0 ) //To find if a number is even the remainder of that number and 2 must be zero.
                    result /= 2;
                    
              else
                    result = 3 * result + 1;
                //Dispaly the output
                System.out.print(result + " ");

            }//end do
            while (result != 1);
            
            //Start the next line
            System.out.println();
            
        }//end for loop

    }//end main method

}//end class
/*Sample Output
 * 
1:  4 2 1 
2:  1 
3:  10 5 16 8 4 2 1 
4:  2 1 
5:  16 8 4 2 1 
6:  3 10 5 16 8 4 2 1 
7:  22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8:  4 2 1 
9:  28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10:  5 16 8 4 2 1 
11:  34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12:  6 3 10 5 16 8 4 2 1 
13:  40 20 10 5 16 8 4 2 1 
14:  7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15:  46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16:  8 4 2 1 
17:  52 26 13 40 20 10 5 16 8 4 2 1 
18:  9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19:  58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20:  10 5 16 8 4 2 1 
21:  64 32 16 8 4 2 1 
22:  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23:  70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24:  12 6 3 10 5 16 8 4 2 1 
25:  76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 
 */
