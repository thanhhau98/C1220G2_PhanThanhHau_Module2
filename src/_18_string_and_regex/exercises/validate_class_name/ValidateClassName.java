package _18_string_and_regex.exercises.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateClassName(){}
    public boolean validate(String regex) {
        pattern = Pattern.compile(CLASSNAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
