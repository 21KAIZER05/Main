/*
Name:Jandoc,Kaizer Franz J
Programming Date: September 07, 2023,
Activity Name and Number: Prelim Exercise Number 3

---------------------------------------------------------------

Algorithm:
1. Find the Perimeter of a rectangle
2. Compute the Perimeter = square root of (length*length+width*width)
3. Show the given length and width of a rectangle
4. Show the computed Perimeter of the rectangle with a given length and width
*/

package main;

import java.lang.*;
public class Rectangle {
    public static void main (String[] args){

        double area;

        double perimeter;   // double the appropriate data type of the perimeter because the
        // value of the radius may be a floating point number

        double length;
        length=219;            //assign 219 as the length of the rectangle

        double width;
        width=128;             // assign 128 as the width of the rectangle



        perimeter=Math.sqrt(length*length + width*width);     // compute the Perimeter of the rectangle
        // with the given length and width

        area= Math.abs(length*width);

        // show the data about the rectangle
        System.out.println( );
        System.out.println( );
        System.out.println("**********************************************************");
        System.out.println("*  length of rectangle is="+ length+"                          *");
        System.out.println( "*  width of rectangle is = "+ width +"                         *");
        System.out.println( " * Computed perimeter of the rectangle="+ perimeter+" *");
        System.out.println("*    Computed area of the rectangle= " + area + "             *");
        System.out.println("*                                                        *");
        System.out.println( "*********************************************************");
    }// end of the main method
}    // end of the Rectangle class