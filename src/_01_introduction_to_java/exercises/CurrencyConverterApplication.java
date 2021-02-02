package _01_introduction_to_java.exercises;
import java.util.Scanner;
public class CurrencyConverterApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Rate USD => VND : ");
        float rate = scanner.nextFloat();
        System.out.println("Input USD : ");
        float usd = scanner.nextFloat();
        float vnd = usd * rate;
        System.out.println(usd+" USD = "+vnd+" VND");
    }
}
