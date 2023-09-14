package main;
import java.lang.*;
public class Square {
    private final double side;
    public Square(double side) {
        this.side = side;
    }
    public double getPerimeter() {
        return 4 * side;
    }
    public double getArea() {
        return side * side;
    }
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Area: " + square.getArea());
    }
}
