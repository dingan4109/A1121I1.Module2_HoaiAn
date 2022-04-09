package ss19_string_regex.baitap;

public class PhoneNumberTest {
    public static String[] validPhoneNumber = new String[]{"(84)-(0978489648)","(56)-(0905705956)"};
    public static String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)","(-@)(013542)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for(String number : validPhoneNumber) {
            System.out.println(phoneNumber.validate(number));
        }
        for(String number : invalidPhoneNumber) {
            System.out.println(phoneNumber.validate(number));
        }
    }
}
