/*
 *author: (Jandoc ,Kaizer Franz,J)
 * programming date:August 24, 2023,
 * activity name and number:prelim exercise number 4

  Problem:
   Write a program that computes and shows the area and the circumference of a circle with
    a given radius. Let the radius be entered through the keyboard at program runtime.

 * Analysis:
Input: Radius of a circle (radius)
Processes:
         Read the radius of the circle
        Compute the circumference of the circle
         Compute the area of the circle
         Display results
Output: circumference, area
* Algorithm:
       1. Read/Accept the radius of the circle
       2. Compute the circumference: circumference = 2 * PI * radius
       3. Compute the area: area = PI * radius * radius
       4. Show the radius of the circle
       5. Show the circumference of the circle
       6. Show the area of the circle

 */
package main;

import java.lang.*;
import java.util.Scanner;

public class Circle3 {
    public static void main(String[] args) {

        // make an object of scanner that represents
        Scanner kbd = new Scanner(System.in);

        int radius;      // variable declaration
        double circumference;   // variable declaration
        double areaOfCircle;  // variable declaration

        // read the radius.print the prompt
        System.out.println("Type the value of the radius the press the enter key: ");
        //assigns an integer entered through the board to radius
        radius = Integer.parseInt(kbd.nextLine());
        // A mathematical expression represents a value that is assigned to the variable
        // circumference
        circumference= 2 *Math.PI*radius;
        // A mathematical expression represents a value that is assigned to the variable
        // areaOfCircle
        areaOfCircle = Math.PI * radius * radius;

        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println("* Radius of the circle is " + radius + "                   *");
        System.out.println("*Circumference of the Circle is " + circumference + "      *");
        System.out.println("* Area of the circle is " + areaOfCircle + "               *");
        System.out.println("********************************************************");
    }// end of the main method
}    // end of the class