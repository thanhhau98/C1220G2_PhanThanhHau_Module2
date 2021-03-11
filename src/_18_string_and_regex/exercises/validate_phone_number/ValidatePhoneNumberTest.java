package _18_string_and_regex.exercises.validate_phone_number;

import _18_string_and_regex.exercises.validate_class_name.ValidateClassName;

import java.util.Scanner;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number test:");
        String phoneNumber = scanner.nextLine();
        boolean isValid = validatePhoneNumber.validate(phoneNumber);
        System.out.println("Class name is " + phoneNumber +" is valid: "+ isValid);
    }
}
