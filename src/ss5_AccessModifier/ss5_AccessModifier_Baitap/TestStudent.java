package ss5_AccessModifier.ss5_AccessModifier_Baitap;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("An");
        student.setClasses("A11");

        System.out.println("Name: " + student.getName() + "\nClass: " + student.getClasses());
    }
}
