package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input element to delete");
        int element = input.nextInt();

        int[] array = {1,2,3,4,0,0,8,9};
        boolean check = false;
        for(int i =0;i<array.length;i++) {
            if(array[i] == element) {
                for(int j = 0;j<array.length-i-1;j++) {
                    array[i+j] = array[i+1+j];
                } array[array.length-1] = 0;
                check = true;
            }
        }
        if(check) System.out.println("New array is: "+Arrays.toString(array));
        else System.out.println("Element is not found");

    }
}
