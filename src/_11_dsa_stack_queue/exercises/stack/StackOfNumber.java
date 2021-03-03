package _11_dsa_stack_queue.exercises.stack;
import java.util.Stack;

public class StackOfNumber {
    private static void stackOfIntegers() {
        Stack<Integer> stack = new Stack();

        int[] arrayOfInteger = {3, 5, 6, 7, 8, 9, 3, 4};

        for (int i = 0; i < arrayOfInteger.length; i++) {
            stack.push(arrayOfInteger[i]);
        }
        System.out.println("After-reverse");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
    }
}
