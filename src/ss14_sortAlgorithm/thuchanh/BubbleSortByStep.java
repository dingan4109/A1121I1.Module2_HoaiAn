package ss14_sortAlgorithm.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = input.nextInt();
        int[] list = new int[size];

        System.out.println("Enter " + list.length + " values");
        for(int i = 0; i<size;i++) {
            //System.out.println("Enter value at index " + i);
            list[i] = input.nextInt();
        }

        System.out.println("Your input list: ");
        System.out.println(Arrays.toString(list));

//        BubbleSort.bubbleSort(list);
//        System.out.println("Sorted list: " + Arrays.toString(list));

        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        int leng = list.length;
        boolean check = true;
        for(int i = 1; i< leng; i++) {
            check = false;
            for(int j = 0; j<leng-i; j++) {
                if(list[j] > list[j+1]) {
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;

                    check = true;
                }
            }
            if(check == false) {
                System.out.println("Array maybe is all sorted");
                break;
            }
        }
        System.out.println("Sorted list: " + Arrays.toString(list));
    }
}
