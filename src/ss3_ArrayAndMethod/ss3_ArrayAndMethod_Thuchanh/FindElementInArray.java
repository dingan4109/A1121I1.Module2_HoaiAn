package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input student's name");
        String studentName = input.nextLine();
        String[] nameList = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

    boolean result = findStudent(nameList,studentName);
    if(!result) System.out.println(studentName +" is not found");
    }

     static boolean findStudent(String[] array, String name) {

        for(int i =0;i< array.length;i++) {
            if(array[i].equals(name)) {
                System.out.println(name + " is at index " + i);
                return true;
            }
        } return false;
    }
}
