package ss19_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^[\\w-]+@[\\w]+(\\.[\\w]+){1,3}$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
