package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[8];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[7] = 5;

        System.out.println("Original array: "+Arrays.toString(array));

        System.out.println("Input index to add");
        int inputIndex = input.nextInt();


        if(inputIndex<0 || inputIndex > array.length-1) {
            System.out.println("Can't add element into array");
        }else {
            System.out.println("Input element to add");
            int inputElement = input.nextInt();

            for(int i = 1;i<array.length-inputIndex;i++) {
                array[array.length-i] = array[array.length-1-i];
            }array[inputIndex] = inputElement;
            System.out.println("New array is: "+Arrays.toString(array));
        }
    }
}
