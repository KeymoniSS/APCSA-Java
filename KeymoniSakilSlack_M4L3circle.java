/* Author: Keymoni Sakil-Slack
 * Date: October 2, 2018
 * Version: 2
 * Program Description: This program will calculate the area and display the radius, diameter, and area of a circle in columns. 
 * What I learned from this program: I learned how to apply Classes, Methods, math class concepts, formatting and rounding,and Objects into code. 
 * What difficulties did I have and how I solved them: I did not encounter any problems during this code.
 */

public class KeymoniSakilSlack_M4L3circle
{
    public KeymoniSakilSlack_M4L3circle(double radius1, double radius2)
    {
        radius = radius1;
        radius = radius2;
    }
    /************************************************************
     * Method: getArea  - This gets the area of a circle based on the radii/radius given
     * @return - This returns the result of muiltplying PI * radius^2
     ***********************************************************/
    public static double getArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    /************************************************************
     * Method: getDiameter  - This gets the Diameter of a circle based on the radii/radius given
     * @return - This returns the result of muliplying the given radius by 2 giving you the diameter
     ***********************************************************/
    public double getDiameter(double radius)
    {
        return  2 * radius;
    }
   
    public double radius;
    double radius1;
    double radius2;
}
