/* Author: Keymoni Sakil-Slack
 * Date: September 20, 2018
 * Version: 1
 * Program Description: This program is a test, highlighting my understanding of Classes, Methods and Objects.
 * What I learned from this program: I learned how to apply Classes, Methods, and Objects into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */

public class KeymoniSakilSlack_M3L7circletester
{
    public static void main(String args[])
    {
        KeymoniSakilSlack_M3L7circle cir1 = new KeymoniSakilSlack_M3L7circle(5.1);
        KeymoniSakilSlack_M3L7circle cir2 = new KeymoniSakilSlack_M3L7circle(20.6);
        cir1.radius = 20;
        System.out.println(cir1.area());
        
    }
}