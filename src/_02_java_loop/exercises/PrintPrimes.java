package _02_java_loop.exercises;
import java.util.Scanner;
public class PrintPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of primes you want print: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N =2 ;
        System.out.println("Primes is :");
        while (count<numbers) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
