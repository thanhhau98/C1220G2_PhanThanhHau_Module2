package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        int size,i=0,min;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int [] array = new int[size];
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +"\t");
        }
        min = array[0];
        for (int j = 1; j < array.length; j++) {
           if (min>array[j]) min=array[j];
           }
        System.out.println("\nMin in array : "+min);
        }
    }
