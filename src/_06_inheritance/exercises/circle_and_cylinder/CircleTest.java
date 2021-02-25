package _06_inheritance.exercises.circle_and_cylinder;

import _06_inheritance.exercises.circle_and_cylinder.Circle;

public class CircleTest {
    public static void main(String[] args) {
       Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5, "blue");
        System.out.println(circle);

        circle = new Circle(3.5,"green");
        System.out.println(circle);
    }
}
