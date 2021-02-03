package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class RemoveElementFromArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("\nEnter element you want remove : ");
        int remove = scanner.nextInt();
        int index=1 ;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == remove) {
                index = index + j;
                System.out.println(remove + " have at position " + index);
                for (int x = index - 1; x < array.length-1 ; x++) {
                    array[x] = array[x + 1];
                }
            }
        }
        System.out.print("Result list : ");
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n]+ "\t");
        }
    }
}
