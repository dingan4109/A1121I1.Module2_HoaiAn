package ss12_collectionFramework.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT");
        Student student4 = new Student("Tung", 38, "HT");

        List<Student> lists = new ArrayList<>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        Collections.sort(lists);
        for(Student student : lists) {
            System.out.println(student);
        }

        Collections.sort(lists, new AgeComparator());
        //OR
//        AgeComparator ageComparator = new AgeComparator();
//        Collections.sort(lists, ageComparator);

        System.out.println("\nSort by age");
        for(Student student : lists) {
            System.out.println(student);
        }
    }
}
