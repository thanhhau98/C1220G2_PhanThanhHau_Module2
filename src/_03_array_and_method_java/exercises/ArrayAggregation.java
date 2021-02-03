package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class ArrayAggregation {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] array1;
        int[] array2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter array1 size: ");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Size should not exceed 20");
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list array 1 : ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] +"\t");
        }
        do {
            System.out.print("\nEnter array 2 size: ");
            size2 = scanner.nextInt();
            if (size2 > 20)
                System.out.println("Size should not exceed 20");
        } while (size2 > 20);
        array2 = new int[size2];
        i=0;
        while (i < array2.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array2[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list array 2 : ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] +"\t");
        }
        int[] array3 = new int[array1.length+array2.length];
        for (int n =0 ;n < array1.length;n++){
            array3[n]=array1[n];
        }
        for (int k=0 ; k <array2.length;k++){
            array3[array1.length+k]=array2[k];
        }
        System.out.print("\nProperty list array 3 : ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] +"\t");
        }
    }
}
