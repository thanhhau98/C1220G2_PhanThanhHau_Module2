package _06_inheritance.exercises.design_triangle;

import _06_inheritance.practices.Shape;

public class Triangle extends Shape {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter();
        return Math.sqrt(halfPerimeter / 2 * (halfPerimeter / 2 - this.side1) * (halfPerimeter / 2 - this.side2) * (halfPerimeter / 2 - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "A Triangle with color is "
                + super.getColor()
                + " and Area = "
                + getArea()
                + " and Perimeter = "
                + getPerimeter();
    }
}
