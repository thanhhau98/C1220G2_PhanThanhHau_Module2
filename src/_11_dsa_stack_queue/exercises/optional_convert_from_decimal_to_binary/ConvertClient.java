package _11_dsa_stack_queue.exercises.optional_convert_from_decimal_to_binary;

import java.util.Scanner;

public class ConvertClient {
    public static void main(String[] args) throws Exception {
        int count=0 ;
        int decimal ;
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input decimal :");
        decimal = scanner.nextInt();
        temp = decimal;
        while (temp>0){
            temp/=2;
            count++;
        }
        temp=decimal;

        MyStack myStack = new MyStack(count);
        while (temp>0){
            myStack.push( temp%2);
            temp/=2;
        }
        System.out.println("result binary:");
        while (!myStack.isEmpty()) {
            System.out.printf(" %d", myStack.pop());
        }
    }
}
