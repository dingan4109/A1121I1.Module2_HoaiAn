package ss14_sortAlgorithm.thuchanh;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {7, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean check = true; //optimize algorithm, avoid unnecessary comparision
        final int length = list.length;
        for(int i = 1; i<length && check;i++) {
            check = false;
            for(int j = 0; j< length-i; j++) {
                if(list[j] > list[j+1]) {
                    int tmp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;

                    check = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        bubbleSort(list);
        System.out.println("Sorted list: " + Arrays.toString(list));
    }
}
