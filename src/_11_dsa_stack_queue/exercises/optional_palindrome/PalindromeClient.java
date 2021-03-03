package _11_dsa_stack_queue.exercises.optional_palindrome;

import java.util.*;

public class PalindromeClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string : ");
        String string = scanner.toString();
        String temp = string.toLowerCase();
        String[] array = temp.split("");
        Queue queue = new LinkedList();
        Stack stack = new Stack();
        for (int i=0 ; i<temp.length();i++){

            stack.push(i);
        }
        for (int i=0 ; i<temp.length() ; i++){
            boolean check = false;
        }
    }
}
