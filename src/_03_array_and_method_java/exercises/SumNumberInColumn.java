package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class SumNumberInColumn {
    public static void main(String[] args) {
        int heightArray,widthArray,sum=0,column;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter height Array size: ");
            heightArray = scanner.nextInt();
            if (heightArray > 20)
                System.out.println("Size should not exceed 20");
        } while (heightArray > 20);
        do {
            System.out.print("\nEnter width Array size: ");
            widthArray= scanner.nextInt();
            if (widthArray > 20)
                System.out.println("Size should not exceed 20");
        } while (widthArray > 20);
        int [][] array = new int[heightArray][widthArray];
        for (int i=0;i<heightArray;i++){
            System.out.println();
            for (int j =0;j<widthArray;j++){
                System.out.print("Enter element " + (i + 1)+"." + (j+1)+ " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Property list matrix : ");
        for (int i = 0; i < heightArray; i++) {
            System.out.println();
            for (int j = 0; j < widthArray; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        do {
            System.out.print("\nEnter column you want sum ");
            column = scanner.nextInt();
            if (column>widthArray)
                System.out.println("Column should not exceed width ");
        } while (column>widthArray);
        for (int i = 0; i < heightArray; i++){
            sum = sum+array[i][column-1];
        }
        System.out.println("Sum at "+column+" of array : "+sum);
    }
}
