/* Author: Keymoni Sakil-Slack
 * Date: September 18, 2018
 * Version: 1
 * Program Description: In this program I had to use the quadratic formula to find the roots of a quadratic equation of the form  ax2 + bx +c = 0 given a, b and c. 
 * What I learned from this program: I leaarn how to apply several Math class methods to make a computation
 * What difficulties did I have and how I solved them: At first I had trouble declaring the x variable because I needed diffrent result assigned to that one variable, but I decided display each as a diffrent name.
 */
public class KeymoniSakilSlack_M3L5A
{
    public static void main(String args[])
    {
    //Hardcoded the integers for int a, b, c;
    
    /*Equation 1: ax^2 + bx +c = 0  
     *a = 1;
     *b = 1;
     *c = -2;
     *x = 1;
    */
    
    double xPlus = (-1 + Math.sqrt(Math.pow(1,2) - 4*1*-2)) / (2*1);   
    double xMinus = (-1 - Math.sqrt(Math.pow(1,2) - 4*1*-2)) / (2*1);    
   
    /*Equation 2: ax^2 + bx +c = 0  
     *a = 2;
     *b = -17;
     *c = 21;
     *x = 1;
    */ 
    
    double xPlusTwo = (-(-17) + Math.sqrt(Math.pow(-17,2) - 4*2*21)) / (2*2);   
    double xMinusTwo = (-(-17) - Math.sqrt(Math.pow(-17,2) - 4*2*21)) / (2*2);    
    
    
    /*Equation 3: ax^2 + bx +c = 0  
     *a = 1;
     *b = 8;
     *c = 15;
     *x = 1;
    */ 
    
    double xPlusThree = (-8 + Math.sqrt(Math.pow(8,2) - 4*1*15)) / (2*1);   
    double xMinusThree = (-8 - Math.sqrt(Math.pow(8,2) - 4*1*15)) / (2*1);    
    
    //Display output for equation 1
    System.out.println("Quadratic Equation Solver ");    
    System.out.println("If a, b and c are 1, 1 and -2, the roots are  " + xPlus + " and "+ xMinus); //use conactentation to display both plus and minus   
    System.out.println("\n "); 
    System.out.println("Quadratic Equation Solver ");    
    System.out.println("If a, b and c are 2, -17 and 21, the roots are  " + xPlusTwo + " and "+ xMinusTwo); //use conactentation to display both plus and minus
    System.out.println("\n "); 
    System.out.println("Quadratic Equation Solver ");    
    System.out.println("If a, b and c are 1, 8 and 15, the roots are  " + xPlusThree + " and "+ xMinusThree); //use conactentation to display both plus and minus
    }
}
/* Sample Output:
 * Quadratic Equation Solver 
 * If a, b and c are 1, 1 and -2, the roots are 1.0 and -2.0 
 * 
 * Quadratic Equation Solver 
 * If a, b and c are 2, -17 and 21, the roots are 7.0 and 1.5
 * 
 * Quadratic Equation Solver 
 * If a, b and c are 1, 8 and 15, the roots are -3.0 and -5.0 
 */