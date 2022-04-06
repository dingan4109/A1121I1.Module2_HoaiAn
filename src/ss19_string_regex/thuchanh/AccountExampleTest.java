package ss19_string_regex.thuchanh;

public class AccountExampleTest {
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        AccountExample example = new AccountExample();
        for(String account : validAccount) {
            System.out.println(example.validate(account));
        }
        for(String account : invalidAccount) {
            System.out.println(example.validate(account));
        }
    }
}
