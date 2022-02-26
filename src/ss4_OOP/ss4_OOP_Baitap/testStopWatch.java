package ss4_OOP.ss4_OOP_Baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class testStopWatch {
    public static void main(String[] args) {
        StopWatch obj = new StopWatch();
        Scanner input = new Scanner(System.in);

        int[] array = {11,2233,111,1221,1};
        int[] array2 = new int[array.length];

        Date start = obj.getStartTime();
        System.out.println(start);

        for(int i = 0; i<array.length-1;i++) {
            int index = i;
            for(int j =i+1;j<array.length;j++) {
                if (array[j] < array[index]) index = j;
            }
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
        }
        System.out.println("Array is " + Arrays.toString(array));

        Date end = obj.getEndTime();
        System.out.println(end);
        System.out.println("Elapsed time is " + obj.getElapsedTime(start,end));
    }
}
