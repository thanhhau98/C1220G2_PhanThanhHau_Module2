package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class MaxInTwoDimensionalArray {
    public static void main(String[] args) {
        int heightMatrix,widthMatrix,a = 0,b = 0,max;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter height Matrix size: ");
            heightMatrix = scanner.nextInt();
            if (heightMatrix > 20)
                System.out.println("Size should not exceed 20");
        } while (heightMatrix > 20);
        do {
            System.out.print("\nEnter width Matrix size: ");
            widthMatrix= scanner.nextInt();
            if (widthMatrix > 20)
                System.out.println("Size should not exceed 20");
        } while (widthMatrix > 20);
        int [][] matrix = new int[heightMatrix][widthMatrix];
        for (int i=0;i<heightMatrix;i++){
            System.out.println();
            for (int j =0;j<widthMatrix;j++){
                System.out.print("Enter element " + (i + 1)+"." + (j+1)+ " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Property list matrix : ");
        for (int i = 0; i < heightMatrix; i++) {
            System.out.println();
            for (int j = 0; j < widthMatrix; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
        max=matrix[0][0];
        for (int i = 0; i < heightMatrix; i++) {
            for (int j = 0; j < widthMatrix; j++) {
                if (max<matrix[i][j]){
                    max=matrix[i][j];
                    a=i+1;
                    b=j+1;
                }
            }
        }
        System.out.print("Max in Matrix : " +max +" at position : ("+a+","+b+")");
    }
}
