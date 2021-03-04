package _13_search_algorithm.exercises.maximun_length_ascending_string;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Find the maximum increasingly ordered subsequence
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch : max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }

/*********************************************************************************
 * 	Analyze the time complexity of your program:                                  *
 * 	1 outerloop = n;                                                              *
 * 	1 innerloop = n - 1;                                                          *
 *  1 simple statement = 1                                                        *
 * 	1 single loop * 1 simple statement = 1;                                       *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2) Quadratic time;                                                 *
 *********************************************************************************/
}

