/* Author: Keymoni Sakil-Slack
 * Date: October 2, 2018
 * Version: 2
 * Program Description: This program will calculate the area and display the radius, diameter, and area of a circle in columns. 
 * What I learned from this program: I learned how to apply Classes, Methods, math class concepts,formatting and rounding, and Objects into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */

import java.text.*;
import java.io.*;
import java.util.*;

public class KeymoniSakilSlack_M4L3PAcircletester
{
    /************************************************************
     * This is the main method which makes use of math classes and objects.
     * @param args Unused.
     * @return Nothing.
     ***********************************************************/
    public static void main(String args[])
    {
        //Create scanner
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter two radii
        System.out.print("Enter Radius 1: ");
        double radius1 = input.nextDouble();
        System.out.print("Enter Radius 2: ");
        double radius2 = input.nextDouble();
        
        KeymoniSakilSlack_M4L3circle radii = new KeymoniSakilSlack_M4L3circle(radius1, radius2);
        
        //Display output
        //Display as double for the event that either radius and diameter contains decimals
        System.out.println("\n");
        System.out.printf("%10s %15s %15s %15s\n", "Circle" , "Radius" , "Diameter" , "Area");
        System.out.printf("\t1 \t%10.1f %15.1f %15.1f \n", radius1, radii.getDiameter(radius1), radii.getArea(radius1));
        System.out.printf("\t2 \t%10.1f %15.1f %15.1f ", radius2, radii.getDiameter(radius2), radii.getArea(radius2));
        
    }
}
/*Sample Run

Sample Input:

Enter Radius 1: 3
Enter Radius 2: 2.5

Sample Output:

Circle		Radius	         Diameter	        Area
1		3		        6		28.3
2		2.5		        5		19.6
 */