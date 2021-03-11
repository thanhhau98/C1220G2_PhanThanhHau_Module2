package _18_string_and_regex.exercises.validate_phone_number;

import _18_string_and_regex.exercises.validate_class_name.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONENUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
