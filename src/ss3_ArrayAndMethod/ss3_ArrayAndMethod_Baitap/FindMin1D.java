package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input array size");
        int size = input.nextInt();

        int[] array = new int[size];
        for(int i =0;i<size;i++) {
            System.out.println("Input element at " + i);
            array[i] = input.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Min element in array: " + findMin1D(array));
    }

    static int findMin1D(int[] array) {
        int min = array[0];
        for(int i = 1;i<array.length;i++) {
            if(array[0] < min) min = array[0];
        } return min;
    }
}
