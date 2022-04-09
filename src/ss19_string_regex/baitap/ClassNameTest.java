package ss19_string_regex.baitap;

public class ClassNameTest {
    public static String[] validClassName = new String[] {"C0318G","A1121I","P0318M"};
    public static String[] invalidClassName = new String[] {"M0318G", "P0323A","a162A1"};

    public static void main(String[] args) {
        ClassName example = new ClassName();
        for(String name : validClassName) {
            System.out.println(example.validate(name));
        }
        for(String name : invalidClassName) {
            System.out.println(example.validate(name));
        }
    }
}
