package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class TotalDiagonalMatrix {
    public static void main(String[] args) {
        int size,total = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter Matrix size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int [][] matrix = new int[size][size];
        for (int i=0;i<size;i++){
            System.out.println();
            for (int j =0;j<size;j++){
                System.out.print("Enter element " + (i + 1)+"." + (j+1)+ " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Property list matrix : ");
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
        for (int i = 0 ; i < size; i++){
            for (int j= 0 ; j < size; j++) {
                if (i == j) {
                    total = total + matrix[i][j];
                }
            }
        }
        System.out.println("\nTotal diagonal Matrix " +total);
    }
}
