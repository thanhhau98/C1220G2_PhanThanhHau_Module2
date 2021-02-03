package _03_array_and_method_java.exercises;
import java.util.Scanner;
public class CountCharacterOccurrencesInString {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = input.nextLine();
        System.out.println("Enter a character ");
        char character = input.nextLine().charAt(0);
        for (int i=0 ; i< str.length();i++){
            if (character==str.charAt(i)){
                count=count+1;
            }
        }
        System.out.println("Character occurrences in string : " +count);
    }
}
