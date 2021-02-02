package _01_introduction_to_java.Exercises;
import java.util.Scanner;
public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else {
            if (number < 20) {
                switch (number - 10) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eightteen");
                        break;
                    case 9:
                        System.out.println("nineteen");
                        break;
                }
            } else {
                if (number < 100) {
                    int ones = number % 10;
                    int tens = number / 10;
                    String first = "";
                    String second = "";
                    switch (ones) {
                        case 1:
                            first = "one";
                            break;
                        case 2:
                            first = "two";
                            break;
                        case 3:
                            first = "three";
                            break;
                        case 4:
                            first = "four";
                            break;
                        case 5:
                            first = "five";
                            break;
                        case 6:
                            first = "six";
                            break;
                        case 7:
                            first = "seven";
                            break;
                        case 8:
                            first = "eight";
                            break;
                        case 9:
                            first = "nine";
                            break;
                    }
                    switch (tens) {
                        case 2:
                            second = "twenty";
                            break;
                        case 3:
                            second = "thirty";
                            break;
                        case 4:
                            second = "fourty";
                            break;
                        case 5:
                            second = "fifty";
                            break;
                        case 6:
                            second = "sixty";
                            break;
                        case 7:
                            second = "seventy";
                            break;
                        case 8:
                            second = "eighty";
                            break;
                        case 9:
                            second = "ninety";
                            break;
                    }
                    System.out.println(second + first);
                } else {
                    if (number < 1000) {
                        int one1 = number / 100;
                        int ten1 = number / 10;
                        int oneHundred = number % 10;
                        String hundred = "";
                        String tenstr = "";
                        String onestr = "";
                        switch (one1) {
                            case 1:
                                hundred = "onehundred";
                                break;
                            case 2:
                                hundred = "twohundred";
                                break;
                            case 3:
                                hundred = "threehundred";
                                break;
                            case 4:
                                hundred = "fourhundred";
                                break;
                            case 5:
                                hundred = "fivehundred";
                                break;
                            case 6:
                                hundred = "sixhundred";
                                break;
                            case 7:
                                hundred = "sevenhundred";
                                break;
                            case 8:
                                hundred = "eighthundred";
                                break;
                            case 9:
                                hundred = "ninehundred";
                                break;
                        }
                        if (ten1 == 1) {
                            switch (oneHundred) {
                                case 0:
                                    tenstr = "";
                                    break;
                                case 1:
                                    tenstr = "eleven";
                                    break;
                                case 2:
                                    tenstr = "twelve";
                                    break;
                                case 3:
                                    tenstr = "thirdteen";
                                    break;
                                case 4:
                                    tenstr = "fourteen";
                                    break;
                                case 5:
                                    tenstr = "fifteen";
                                    break;
                                case 6:
                                    tenstr = "sixteen";
                                    break;
                                case 7:
                                    tenstr = "seventeen";
                                    break;
                                case 8:
                                    tenstr = "eighteen";
                                    break;
                                case 9:
                                    tenstr = "nineteen";
                                    break;
                            }
                            System.out.println(hundred + "and" + tenstr);
                        } else {
                            switch (ten1) {
                                case 0:
                                    tenstr = "";
                                    break;
                                case 2:
                                    tenstr = "twenty";
                                    break;
                                case 3:
                                    tenstr = "thirty";
                                    break;
                                case 4:
                                    tenstr = "fourty";
                                    break;
                                case 5:
                                    tenstr = "fifty";
                                    break;
                                case 6:
                                    tenstr = "sixty";
                                    break;
                                case 7:
                                    tenstr = "seventy";
                                    break;
                                case 8:
                                    tenstr = "eighty";
                                    break;
                                case 9:
                                    tenstr = "ninety";
                                    break;
                            }
                            switch (oneHundred) {
                                case 1:
                                    onestr = "one";
                                    break;
                                case 2:
                                    onestr = "two";
                                    break;
                                case 3:
                                    onestr = "three";
                                    break;
                                case 4:
                                    onestr = "four";
                                    break;
                                case 5:
                                    onestr = "five";
                                    break;
                                case 6:
                                    onestr = "six";
                                    break;
                                case 7:
                                    onestr = "seven";
                                    break;
                                case 8:
                                    onestr = "eight";
                                    break;
                                case 9:
                                    onestr = "nine";
                                    break;
                            }
                            System.out.println(oneHundred + "and" + tenstr + onestr);
                        }
                    }
                }
            }
        }
    }
}
