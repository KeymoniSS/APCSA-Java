
/* Author: Keymoni Sakil-Slack
 * Date: September 11, 2018
 * Version: 1
 * Program Description: This program is a test introducing the conceptds of strings
 * What I learned from this program: I learned how to compe concatenation and length string methods, as well as, substring methods.
 * What difficulties did I have and how I solved them: I had no difficulties during this assignment. Everything thing I complied presented no syntax errors.  
 */
public class KeymoniSakilSlack_M2L4PA
{
    public static void main(String args[])
    {
        String mm = "Hello";
        String nx = "good buddy";
        String c = mm + " " + nx;
        String d = "computer science";
        System.out.println(c.length());
        
        String myPet = "Sparky the dog";
        String smallPart = myPet.substring(4, 12);
        System.out.println(smallPart);
        
        System.out.println(d.length());
    }
    
}
/* Compared to the code in the second video, the variable names the instructor used in the first video was not as good as the ones presented in this second. 
 * This is true for two main reasons. For starters, compared to the second video in which he used decriptive variables to represent his data,the variable names he had chosen for the first video were vague, undescriptive, didn't really really tell you what about what the variables were representing.
 * Second, he used random characters to represent his variables. This could cause problems along the way similar to the one presented in his first video. In the first video he put the wrong characters while compling the concatenation, which ended in a syntax error.
 * 

*/
