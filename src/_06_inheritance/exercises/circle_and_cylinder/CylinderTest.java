package _06_inheritance.exercises.circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5,6, "red");
        System.out.println(cylinder);

        cylinder = new Cylinder(2.8,7.5,"green");
        System.out.println(cylinder);
    }
}
