package ss17_io_binaryFile_serialization.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void writeToFile(String path, List<Student> students) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(students);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Student> readDataFromFile(String path) {
        ObjectInputStream ois = null;
        List<Student> students = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            students = (List<Student>)ois.readObject();

        }catch (Exception e) {

        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"A","HN"));
        students.add(new Student(2,"B","HN"));
        students.add(new Student(3,"C","HN"));
        students.add(new Student(4,"D","HN"));
        students.add(new Student(5,"E","HN"));

        writeToFile("studentFile.txt",students);
        List<Student> studentList = readDataFromFile("studentFile.txt");
        for(Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
