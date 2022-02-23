package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input size");
        int size = input.nextInt();

        int[] testArray = new int[size];
        for (int i=0;i<testArray.length;i++) {
            System.out.println("Input element at " + (i+1));
            testArray[i] = input.nextInt();
        }

        System.out.print("Input array is: ");
        for(int element:testArray) {
            System.out.print(element + "\t");
        }

        findMax(testArray);
    }

    static void findMax(int[] array) {
        int max = array[0];
        for(int i = 1;i<array.length;i++) {
            if(array[i]>max) max = array[i];
        }
        System.out.println("\nMax element is " + max);
    }

    //Tham khảo
    static int findMax2(int a, int b) {
        return a>b? a:b;
    }
}

