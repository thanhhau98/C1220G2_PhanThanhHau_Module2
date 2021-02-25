package _07_abstract_class_and_interface.exercises.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(6);
        shapes[1]=new Rectangle(3,4);
        shapes[2]=new Square(5);

        System.out.println("Pre-size :");

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
        System.out.println("After-size :");

        shapes[0].resize(Math.random()*100);
        shapes[1].resize(Math.random()*100);
        shapes[2].resize(Math.random()*100);

    }
}
