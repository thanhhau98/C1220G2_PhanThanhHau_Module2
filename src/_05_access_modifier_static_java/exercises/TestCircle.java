package _05_access_modifier_static_java.exercises;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Radius: "+circle.getRadius()+"\nArea: "+circle.getArea());
    }
}
