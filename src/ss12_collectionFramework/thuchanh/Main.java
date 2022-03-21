package ss12_collectionFramework.thuchanh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");

        // DÙNG MAP: key không được trùng, value được trùng
        Map<Integer,Student> hashMap = new HashMap();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(4,student1);

        //Cách 1: Dùng entrySet()
        Set<Map.Entry<Integer, Student>> entrySet = hashMap.entrySet();
        for(Map.Entry<Integer,Student> student : entrySet) {
            System.out.println(student.toString());
        }

//        //Cách 2: Dùng keySet()
//        Set<Integer> keySet = hashMap.keySet();
//        for(Integer key : keySet) {
//            System.out.print(key + ": ");
//            System.out.println(hashMap.get(key));
//        }
//
//        //Cách 3: Dùng values() // Không có key
//        Collection<Student> studentList = hashMap.values();
//        for(Student student : studentList) {
//            System.out.println(student);
//        }

        // DÙNG SET: Không được trùng phần tử
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1); // Không add đc vì trùng

        for(Student student : hashSet) {
            System.out.println(student.toString());
        }
    }
}
