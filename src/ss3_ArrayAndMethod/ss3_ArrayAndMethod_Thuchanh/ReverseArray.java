package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input array length");
        int n = input.nextInt();
        int [] myArray = new int[n];

        for(int i =0;i<n;i++){
            System.out.println("input array elements at " + i );
            myArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        reverseArray1(myArray);
        //reverseArray2(myArray);
    }

//Cách 1:
    static void reverseArray1(int[] array) {
        for (int i =0;i<array.length/2;i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
//Cách 2:
    static void reverseArray2(int[] array) {
        int[] newArray = new int[array.length];
        for(int i =0;i<array.length;i++) {
            newArray[i] = array[array.length-1-i];
        } System.out.println(Arrays.toString(newArray));
    }
}
