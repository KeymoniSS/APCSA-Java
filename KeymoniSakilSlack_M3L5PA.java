/* Author: Keymoni Sakil-Slack
 * Date: September 18, 2018
 * Version: 1
 * Program Description: This programs practices with the Math Class methods
 * What I learned from this program: I learned how to properly apply Math Class methods to code.
 * What difficulties did I have and how I solved them: I did not encounter any problems while developing this code.
 */
public class KeymoniSakilSlack_M3L5PA
{
    public static void main(String args[])
    {
    //Declare and intiated variables
    int x, y, z;    
    double w;
    
    x = 3;
    y = -5;
    w = 17.5;
    
    z = Math.abs(y);
    
    //Apply Math Class methods
    double sqrtOfW = Math.sqrt(w); //returns 4.183300132670378
    double powOfZ = Math.pow(x,z); //returns 243
    int max = Math.max(x,y); //returns 3
    int min = Math.min(x,y); //returns -5
    double roundW = Math.round(w); //returns 18
    double floorW = Math.floor(w); //returns 17
    double ceilW = Math.ceil(w); //returns 18
    double random = Math.random() * 10; //returns a random number between 1 and 10
    
    //Display the output
    System.out.println("w = " + w + ", x = " + x + ", y = " + y + ", z = " + z);    
    System.out.println("z is the absolute value of y and is " +z);    
    System.out.println("The square root of w is " + sqrtOfW);
    System.out.println("x raised to the power of z is " + powOfZ);
    System.out.println(max + " is the max of x and y");
    System.out.println(min + " is the min of x and y");
    System.out.println("If you round w you get " + roundW);
    System.out.println("The floor value of w is " + floorW);
    System.out.println("The ceiling value of w is " + ceilW);
    System.out.println("A random number between 1 and 10 is " + random);
    }
}
/* Sample Output:
 * w = 17.5, x = 3. y = -5, z = 5 
 *z is the absolute value of y and is 5
 *The square root of w is 4.183300132670378
 *x raised to the power of z is 243.0
 *3 is the max of x and y
 *-5 is the min of x and y
 *If you round w you get 18.0
 *The floor value of w is 17.0
 *The ceiling value of w is 18.0
 *a random number between 1 and 10 is: //returns a "random" number between 1 and 10
 */