package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import java.util.Scanner;

public class FindMin {
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

        int result = findMin(testArray);
        System.out.println("\nMin element is " + result);
    }

    static int findMin(int[] array) {
        int index = 0;
        for(int i = 0;i<array.length;i++) {
            if(array[i]<array[index]) index = i;
        } return array[index];
    }

    //Tham khảo
    static int findMin2(int a, int b) {
        return a<b? a:b;
    }
}
