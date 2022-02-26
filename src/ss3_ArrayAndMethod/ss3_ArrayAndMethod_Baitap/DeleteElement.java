package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input element to delete");
        int element = input.nextInt();

        int[] array = {1,2,3,4,0,0,8,9};
        int index_del=-1;
        for(int i = 0;i<array.length;i++) {
            if(array[i] == element) {
                index_del = i; break;
            }
        }

        int[] array2 = new int[array.length-1];
        if(index_del!= -1) {
            int j = 0;
            for (int i = 0;i<array.length;i++) {
                if(i==index_del) {continue;}
                array2[j++] = array[i];
            } System.out.println("New array: " + Arrays.toString(array2));
        }else {
            System.out.println("Element is not found");
        }

    }
}
