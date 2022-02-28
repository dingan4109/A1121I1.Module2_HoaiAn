package ss5_AccessModifier.ss5_AccessModifier_Thuchanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1,"An");
        Student s2 = new Student(2,"Hoai");
        Student s3 = new Student(3,"Vu");

        s1.display();
        s2.display();
        s3.display();
    }
}
