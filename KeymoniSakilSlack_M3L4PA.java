
/* Author: Keymoni Sakil-Slack
 * Date: September 18, 2018
 * Version: 1
 * Program Description: This program will calulate the titled area of a resistance pool.
 * What I learned from this program: In this program, I learned how to assign constants
 * What difficulties did I have and how I solved them: I did have trouble applying decimal formatting to my final calculation. After applying the string method my problem was resolved.
 */

public class KeymoniSakilSlack_M3L4PA
{
    public static void main(String args[])
    {
    double diameterOfPool, diameterOfIsland, radiusOfPool, radiusOfIsland, areaOfPool, areaOfIsland, areaOfBottom;
    //PI declared as a constant
    final double PI = 3.1415;    
    
    //Declare the diameter of each circle
    diameterOfPool = 8.32;
    diameterOfIsland = 1.91;
    
    //To find radii divide diameters by 2
    radiusOfPool = diameterOfPool/2 ;
    radiusOfIsland = diameterOfIsland/2 ;
    
    //Area of circle = pi*radius^2
    areaOfPool = PI * Math.pow(radiusOfPool,2);
    areaOfIsland = PI * Math.pow(radiusOfIsland,2);
    
    //Subtract areaOfIsland from areaOfPool to find the tiled area aka the area of the bottom of the pool
    areaOfBottom = areaOfPool - areaOfIsland; 
    
    //Set bottom as string to allow decimal formatting
    String bottomAsString = String.format("%.2f", areaOfBottom);
    
    //Display output
    System.out.println("A resistance pool with a diameter of 8.32 meters that contains a\ncircular island of 1.91 meters has " + bottomAsString + " square meters that\nneeds tile.");
 
    }
}
/* Sample Output:
 * A resistance pool with a diameter of 8.32 meters that contains a 
 * circular island of 1.91 meters has 51.50 square meters that 
 * needs tile.  
 * 
 */