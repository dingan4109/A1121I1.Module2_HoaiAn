package ss14_sortAlgorithm.thuchanh;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        int length = list.length;
        int min;
        for(int i = 0;i<length;i++) {
         min = i;
         for(int j = i+1; j < length;j++) {
             if(list[j] < list[min]) {
                 min = j;
             }
         }
         if(min != i) {
             double tmp = list[min];
             list[min] =  list[i];
             list[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
