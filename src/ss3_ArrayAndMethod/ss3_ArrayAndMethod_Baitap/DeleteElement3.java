package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        System.out.println("Input element to delete");
        int element = input.nextInt();

        int[] array = {0,2,1,2,3,4,0,0,8,9};

        for(int i=0;i<array.length;i++) {
            if(array[i] == element) {
                for(int j = i;j<array.length-1;j++) {
                    array[j] = array[j+1];
                } i--;
            }
        }
        for(int i = 1;i<=count;i++) {
            array[array.length-i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
