package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class AddElementToArray {
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
            System.out.print(array[j] +"\t");
        }
        System.out.println("\nEnter element you want add : ");
        int add = scanner.nextInt();
        System.out.println("\nEnter index you want add : ");
         int index = scanner.nextInt();
        while (index<=1||index>=array.length-1){
            System.out.println("Can't add element to array  ");
            System.out.println("Enter index you want add : ");
             index = scanner.nextInt();
        }
        int temp = index;
        for (int j = 0; j < array.length; j++) {
            if (j==index-1) {
                index = index + j;
                for (int x = array.length-1-j; x >=index-1 ; x--) {
                    array[x] = array[x -1];
                }
                array[temp-1]=add;
            }
        }
        System.out.print("Result list : ");
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n]+"\t");
        }
    }
}
