package ss14_sortAlgorithm.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortStepByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = input.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values");
        for(int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("Your input list: ");
        System.out.println(Arrays.toString(list));

        insertionSortStepByStep(list);
        System.out.println("Sorted list: ");
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSortStepByStep(int[] list) {
        final int length = list.length;
        int j;
        for(int i = 1; i< length;i++) {
            j=i;
            while(j>0 && list[j] < list[j-1]) {
                int tmp = list[j];
                list[j] = list[j-1];
                list[j-1] = tmp;

                j--;
            }
        }
    }
}
