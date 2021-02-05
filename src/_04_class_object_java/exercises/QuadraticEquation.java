package _04_class_object_java.exercises;
import java.util.Scanner;
public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return  this.b*this.b-4*this.a*this.c;
    }

    public double getRoot1 ( double delta) {
        return (-b + Math.pow(delta,0.5)) / (2*a);
    }

    public double getRoot2 (double delta) {
        return  (-b - Math.pow(delta,0.5)) / (2 * a);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,delta,equation1,equation2;
        System.out.println("Input a: ");
        a = input.nextDouble();
        System.out.println("Input b: ");
        b = input.nextDouble();
        System.out.println("Input c: ");
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        delta =quadraticEquation.getDiscriminant();
        if (delta>0){
            equation1 = quadraticEquation.getRoot1(delta);
            equation2 = quadraticEquation.getRoot2(delta);
            System.out.println(" equation1: "+equation1+"\n"+
                    "equation2: "+equation2);
        }else {
            if (delta==0){
                equation1=quadraticEquation.getRoot1(delta);
                System.out.println("equation: "+equation1);
            }else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
