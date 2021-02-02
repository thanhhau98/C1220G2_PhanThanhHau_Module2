package _02_java_loop.exercises;
import java.util.Scanner;
public class DisplayFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int height ;
        int width ;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your height: ");
                    height = input.nextInt();
                    System.out.println("Enter your width: ");
                    width = input.nextInt();
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < height; i++) {
                        System.out.println();
                        for (int j = 0; j < width; j++) {
                            System.out.print("   *");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter your width: ");
                    width = input.nextInt();
                    System.out.println("Print the square triangle ( top-left) ");
                    for (int i = 0; i < width; i++) {
                        System.out.println();
                        for (int j = 0; j < width - i; j++) {
                            System.out.print("   *");
                        }
                    }
                    System.out.println("\nPrint the square triangle ( bottom-left) ");
                    for (int i = 0; i < width; i++) {
                        System.out.println();
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("   *");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter your width: ");
                    width = input.nextInt();
                    if (width % 2 == 0) {
                        System.out.println("Can't print isosceles triangle ");
                    } else {
                        System.out.println("Print isosceles triangle ");
                        for (int i = 0; i < width / 2 + 1; i++) {
                            System.out.println();
                            for (int j = 0; j < i + 1; j++) {
                                System.out.print("   *");
                            }
                        }
                        for (int i = 0; i < width / 2; i++) {
                            System.out.println();
                            for (int j = 0; j < width / 2 - i; j++) {
                                System.out.print("   *");
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (true);
    }
}
