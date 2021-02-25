package _06_inheritance.exercises.design_triangle;

import _06_inheritance.exercises.point2d_and_point3d.Point3D;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3 ,4 ,6,"red",true);
        System.out.println(triangle);
    }
}
