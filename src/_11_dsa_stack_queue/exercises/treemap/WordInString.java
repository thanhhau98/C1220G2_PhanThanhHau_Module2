package _11_dsa_stack_queue.exercises.treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class WordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string:");
        String string = scanner.nextLine();
        int value = 1;
        string.toLowerCase();
        String[]array=string.split(" ");
        TreeMap<String,Integer> map= new TreeMap<>();
        for (int i= 0 ; i < array.length;i++){
            if (map.containsKey(array[i])){
                int count = map.get(array[i]);
                map.put(array[i],count+1);
            }else {
                map.put(array[i], value);
            }
        }
        System.out.println(map);
    }
}
