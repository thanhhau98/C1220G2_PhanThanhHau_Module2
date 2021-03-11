package _18_string_and_regex.exercises.validate_class_name;

import java.util.Scanner;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input class name test:");
        String className = scanner.nextLine();
        boolean isValid = validateClassName.validate(className);
        System.out.println("Class name is " + className +" is valid: "+ isValid);
    }
}
