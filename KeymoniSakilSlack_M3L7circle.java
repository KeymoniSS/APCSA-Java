/* Author: Keymoni Sakil-Slack
 * Date: September 20, 2018
 * Version: 1
 * Program Description: This program is a test, highlighting my understanding of Classes, Methods and Objects.
 * What I learned from this program: I learned how to apply Classes, Methods, and Objects into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */

public class KeymoniSakilSlack_M3L7circle
{
    public KeymoniSakilSlack_M3L7circle(double r)
    {
        radius = r;
    }
    
    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }
    
    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
    
    public void setRadius(double nr)
    {
        radius = nr;
    }
    
    public double radius;
}
