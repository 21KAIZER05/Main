/*
Name:Jandoc,Kaizer Franz J
Programming Date: September 05, 2023,
Activity Name and Number: Prelim Exercise Number 3
Algorithm:
1. Determine the hypotenuse of a right triangle
2. Compute the hypotenuse = square root of (height*height+base*base)
3. Show the given base and height of a right triangle
4. Show the computed hypotenuse of the right triangle with a given height and base
*/
package main;
import java.lang.*;
public class RightTriangle {
    public static void main (String[] args){
        double hypotenuse;       // double the appropriate data type of the radius because the
                             // value of the radius may be a floating point number
        double height;
        height=210;            //assign 21 as the height of the right triangle
        double base;
        base=128;             // assign 26 as the base of the right triangle
        hypotenuse=Math.sqrt(height*height + base*base);     // compute the hypotenuse of the right triangle
                                                             // with the given base and height
         // show the data about the right triangle
         System.out.println( );
         System.out.println( );
         System.out.println("********************************************");
         System.out.println("* Given base of the right triangle="+ base +"  *" );
         System.out.println( "* Given height of the right triangle= "+ base +"  *");
         System.out.println( " * Computed hypotenuse of the right triangle="+ hypotenuse +" *");
         System.out.println( "*********************************************");
    }// end of the main method
}    // end of the RightTriangle2 class
