package com.madeeasy.week3.session1.assignment2;

/**
 * The type Shape.
 */
class Shape {
    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea() {
        return 0.0;
    }
}

/**
 * The type Circle.
 */
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
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * The type Square.
 */
class Square extends Shape {
    private int length;

    /**
     * Instantiates a new Square.
     *
     * @param length the length
     */
    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
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
    public double getArea() {
        return width * height;
    }
}

/**
 * The type AbstractionExample.
 */
public class InheritanceOfShape {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
    }
}
/**
 * o/p
 * ---
 * 78.53981633974483
 * 12.0
 */
