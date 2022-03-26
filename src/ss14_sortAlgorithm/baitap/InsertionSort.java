package ss14_sortAlgorithm.baitap;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {7, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] list) {
        int length = list.length;

        int j;
        for(int i = 1; i<length;i++) {
            j = i;
            while(j > 0 && list[j] <list[j-1]) {
                int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;

                    j--;
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
