package _15_exception_and_debug.exercises.iIlegal_triangle_exception;

import java.util.Scanner;

public class TriangleExample  {
    public static void validate(int a , int b , int c) throws IIllegalTriangleException{
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new  IIllegalTriangleException (a + ", " + b + " ," + c + " ," + "aren't three edges of triangle");
        } else {
            System.out.println(a + ", " + b + " ," + c + " ," + "are three edges of triangle");
        }
    }
    public static void main(String[] args) {
        while (true){
        try {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input a:");
        int a = scanner.nextInt();
        System.out.println("input b:");
        int b = scanner.nextInt();
        System.out.println("input c:");
        int c = scanner.nextInt();
        validate(a,b,c);
        break;

        }catch (IIllegalTriangleException e){
            System.err.println("Triangle not exist"+e.getMessage());
        }
    }
    }
}
