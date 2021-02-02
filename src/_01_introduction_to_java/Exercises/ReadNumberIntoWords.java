package _01_introduction_to_java.Exercises;
import java.util.Scanner;
public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int ones = number % 10;
        int tens = (number %100)/10;
        int hundred = number /100 ;
        String first = "";
        String second = "";
        String third = "";
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
                switch (ones) {
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
                        switch (hundred) {
                            case 1:
                                third = "onehundred";
                                break;
                            case 2:
                                third = "twohundred";
                                break;
                            case 3:
                                third = "threehundred";
                                break;
                            case 4:
                                third = "fourhundred";
                                break;
                            case 5:
                                third = "fivehundred";
                                break;
                            case 6:
                                third = "sixhundred";
                                break;
                            case 7:
                                third = "sevenhundred";
                                break;
                            case 8:
                                third = "eighthundred";
                                break;
                            case 9:
                                third = "ninehundred";
                                break;
                        }
                        if (tens == 1) {
                            switch (ones) {
                                case 0:
                                    second = "";
                                    break;
                                case 1:
                                    second = "eleven";
                                    break;
                                case 2:
                                    second = "twelve";
                                    break;
                                case 3:
                                    second= "thirdteen";
                                    break;
                                case 4:
                                    second = "fourteen";
                                    break;
                                case 5:
                                    second = "fifteen";
                                    break;
                                case 6:
                                    second = "sixteen";
                                    break;
                                case 7:
                                    second = "seventeen";
                                    break;
                                case 8:
                                    second = "eighteen";
                                    break;
                                case 9:
                                    second = "nineteen";
                                    break;
                            }
                            System.out.println(third + " and " + second);
                        } else {
                            switch (tens) {
                                case 0:
                                    second = "";
                                    break;
                                case 2:
                                    second = "twenty";
                                    break;
                                case 3:
                                    second = "thirty";
                                    break;
                                case 4:
                                    second= "fourty";
                                    break;
                                case 5:
                                    second= "fifty";
                                    break;
                                case 6:
                                    second = "sixty";
                                    break;
                                case 7:
                                    second= "seventy";
                                    break;
                                case 8:
                                    second = "eighty";
                                    break;
                                case 9:
                                    second = "ninety";
                                    break;
                            }
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
                            System.out.println(third +" and "+second + first);
                        }
                    }
                }
            }
        }
    }
}
