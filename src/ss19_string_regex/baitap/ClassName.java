package ss19_string_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private final String CLASS_NAME = "^[ACP][0-9]{4}[GHIKLM]$";

    public ClassName(){}

    public boolean validate(String regex) {
        return Pattern.matches(CLASS_NAME,regex);

    }

}
