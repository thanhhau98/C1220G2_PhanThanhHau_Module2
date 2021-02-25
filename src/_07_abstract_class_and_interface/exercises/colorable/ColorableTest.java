package _07_abstract_class_and_interface.exercises.colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(20);
        shapes[3] = new Square(5);

        System.out.println("Pre-size :");

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }
    }
}
