/* Author: Keymoni Sakil-Slack
 * Date: September 20, 2018
 * Version: 1
 * Program Description: This program is based on the game where you have to guess a celebrity names,  in which only partially recognizable names of celebrities are avaiable. 
 * What I learned from this program: I learned how to combine string methods and escape sequences onto a single line.
 * What difficulties did I have and how I solved them: At first I didn't know how to combine two string method in the println statement and my code wouldn't complie correctly. But after I aligned them such as so: "c1.toLowerCase().substring(2,9)" my code complied fine. 
 * 
 */

public class KeymoniSakilSlack_M3L6A
{
    public static void main(String args[])
    {
     
     
     String c1 = "Taylor Swift";
     String c2 = "John Boyega";
     String c3 = "Emma Stone";
     String s1 = "The number of";

     String s2 = "rabbits is";

     int argh = 129;



     String report = s2 + "\t" +argh;


     System.out.println( "\t" + s1 + " \n"+ "\t" + report + ".");


     System.out.println(c1 + ">>>" + c1.toLowerCase().substring(2,9) +"\n" + c2 + ">>>" + c2.toLowerCase().substring(2,8) + "\n" + c3 + ">>>" + c3.toLowerCase().substring(2,7));
        
         
        
    }
}
/* Sample Output:
 * 
 * Taylor Swift>>> ylor sw 
 * John Boyega>>> hn boy 
 * Emma Stone>>> ma st 
 * 
 */