package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class PassingStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qty;

       do{
           System.out.println("Input student quantity");
           qty = input.nextInt();
           if(qty>30) System.out.println("Maximum 30 students, input again pls");
       }while(qty>30);

       int[] studentScoreList = new int[qty];
       int count = 0;

       for(int i = 0;i<qty;i++) {
           System.out.println("Input score");
           studentScoreList[i] = input.nextInt();
           if(studentScoreList[i]>=5 && studentScoreList[i] <=10) count +=1;
       }
        System.out.println(Arrays.toString(studentScoreList));
        System.out.println(count + " passing students");

       }
}
