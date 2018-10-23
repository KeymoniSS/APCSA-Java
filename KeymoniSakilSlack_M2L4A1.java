/* Author: Keymoni Sakil-Slack
 * Date: September 11, 2018
 * Version: 1
 * Program Description: This program would list a full name, the length of a first name, as well as declare 3 letters from a last name
 * What I learned from this program: I learned how to create a concatenation, simple string methods, and also a substring method with two arguments.
 * What difficulties did I have and how I solved them: I had no difficulties during this assignment. Everything I complied displayed no syntax errors. I belive I grasp this concept very well.
 */
public class KeymoniSakilSlack_M2L4A1
{
    public static void main(String args[])
    {
        //Assign variables for first and last name
        String FirstName = "Keymoni";
        String LastName = "Sakil-Slack";
        
        //Create concatenation to create a full name
        String FullName = FirstName + " " + LastName;
        
        //Will display three letters of LastName variable
        String LastNameSubstring = LastName.substring(2,5);
        
        //Display output
        System.out.println("My name is " + FullName);
        System.out.println("My first name is " + FirstName.length() + " letters long");
        System.out.println("A substring of my last name is " + LastNameSubstring);
        
    }
}
/* Sample Output:

My name is Keymoni Sakil-Slack
My first name is 7 letters long
A substring of my last name is kil


*/
