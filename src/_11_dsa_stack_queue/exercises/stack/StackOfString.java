package _11_dsa_stack_queue.exercises.stack;

import java.util.Stack;

public class StackOfString {
    private static void stackOfString() {
        Stack<String> wStack = new Stack<>();

        String str = "ABCD";

        String[] word = str.split("");

        for (int i =0;i<word.length;i++){
            wStack.push(word[i]);
        }
        while (!wStack.isEmpty()) {
            System.out.printf(" %s",wStack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("\n2. Stack of Strings");
        stackOfString();
    }

}
