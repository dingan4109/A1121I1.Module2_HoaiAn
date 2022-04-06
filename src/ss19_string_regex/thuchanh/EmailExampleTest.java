package ss19_string_regex.thuchanh;

public class EmailExampleTest {
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        EmailExample example = new EmailExample();
        for(String email : validEmail) {
            System.out.println(example.validate(email));
        }
        for(String email : invalidEmail) {
            System.out.println(example.validate(email));
        }
    }
}
