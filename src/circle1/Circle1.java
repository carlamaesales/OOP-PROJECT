/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle1;

/**
 *
 * @author Carla Mae
 */

    // Abstract base class Shape
abstract class Shape {
    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class inheriting from Shape
public class Circle1 extends Shape {
    // Attribute
    private double radius;

    // Constructor to set radius
    public Circle1(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract method for area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement abstract method for perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Circle instance 
        Shape circle = new Circle1(5.0);

        // Print radius using getter
        System.out.println("Radius: " + ((Circle1) circle).getRadius());

        // Calculate and print area and circumference
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculatePerimeter());

        // Demonstrate modification with setter
        ((Circle1) circle).setRadius(7.0);
        System.out.println("\nAfter modification:");
        System.out.println("New Radius: " + ((Circle1) circle).getRadius());
        System.out.println("New Area: " + circle.calculateArea());
        System.out.println("New Circumference: " + circle.calculatePerimeter());
    }
}