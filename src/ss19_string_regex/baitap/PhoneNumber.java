package ss19_string_regex.baitap;

import java.util.regex.Pattern;

public class PhoneNumber {
    //(xx)-(0xxxxxxxxx)
    private final String PHONE_NUMBER = "\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";

    public PhoneNumber(){}

    public boolean validate(String regex) {
        return Pattern.matches(PHONE_NUMBER,regex);
    }
}
