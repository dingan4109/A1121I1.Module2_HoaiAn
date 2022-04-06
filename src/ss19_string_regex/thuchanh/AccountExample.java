package ss19_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX = "[a-z0-9_]{6,}";

    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
