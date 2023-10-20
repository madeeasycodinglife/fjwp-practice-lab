package com.madeeasy.week3.session2.assignment1;

import java.text.DecimalFormat;

abstract class Shape {
    /**
     * Calculate area double.
     *
     * @return the double
     */
    abstract double calculateArea();
}

class Circle extends Shape {
    private int radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * The type Rectangle.
 */
class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * Instantiates a new Rectangle.
     *
     * @param width  the width
     * @param height the height
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

/**
 * The type AbstractionExample.
 */
public class AbstractionExample {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        String formattedResult = new DecimalFormat("##.##").format(circle.calculateArea());

        System.out.println("The area of the circle is " + formattedResult);

        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("The area of the rectangle is " + rectangle.calculateArea());
    }
}
/**
 * o/p
 * ---
 * The area of the circle is 78.54
 * The area of the rectangle is 12.0
 */