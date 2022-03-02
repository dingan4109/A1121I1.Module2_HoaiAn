package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input element to delete");
        int element = input.nextInt();

        int[] array = {0,1,2,2,3,4,0,0,8,9};

        int count = 0;
        for(int i = 0; i< array.length;i++) {
            if(array[i] == element) count ++;
        }

        int j =0;
        int array2[] = new int[array.length - count];
        for(int i=0;i<array.length;i++) {
            if(array[i] != element) {
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println("New array is: "+Arrays.toString(array2));

    }
}
