package main;
/*
Name:Jandoc,Kaizer Franz J
Programming Date: September 05, 2023,
Activity Name and Number: Prelim Exercise Number 3
Algorithm:
1. Determine the area of a right triangle
2. Compute the area = square root of (height*height+base*base)
3. Show the given base and height of a right triangle
4. Show the computed hypotenuse of the right triangle with a given height and base
*/
// RightTriangle3.java
import java.util.Scanner;
public class RightTriangle3 {
    public static void main(String[] args) {

        // Get the base and height from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        // Calculate the area of the triangle.
        double area = 0.5 * base * height;
        // Print the area of the triangle.
        System.out.println();
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("The area of the triangle is " + area);
        System.out.println("*compute the base of the triangle  "+base+"*");
        System.out.println("*compute the height of the triangle "+height+"*");
        System.out.println("************************************************");
    }
}

