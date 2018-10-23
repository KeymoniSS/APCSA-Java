
/* Author: Keymoni Sakil-Slack
 * Date: September 13, 2018
 * Version: 1
 * Program Description: The program displays the length, width, perimeter, area and extended perimeter and area of a given rectangle.
 * What I learned from this program: I learned how apply the concepts of order of operations into code. 
 * What difficulties did I have and how I solved them: For this program I expiernced no problems. When complied, my code presented no syntax errors and complied fine.
 */
public class KeymoniSakilSlack_M3L2A
{
    public static void main(String args[])
    {
        //Display values as integers and set variables
        int length, width, perimeter, area, bigPerimeter, bigArea;
        
        //Set length and width variables
        length = 5;
        width = 4;
        
        //Calculate the perimeter and area with their formulas
        perimeter = (2 * length) + (2 * width);
        area = length * width;
        
        
        //Calculate with (length + 1) and (width + 1)
        bigPerimeter = (2 * (length  + 1)) + (2 * (width + 1));
        bigArea = (length + 1) * (width + 1);
        //The new length should be 6 and the new width should be 5
        
         
        //Display the output
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        System.out.println("BigPerimeter = " + bigPerimeter);
        System.out.println("BigArea = " + bigArea);
    }
}
/* Sample Output
 * Length  = 5
 * Width = 4
 * Perimeter = 18
 * Area = 20
 * BigPerimeter = 22
 * BigArea = 30

 */