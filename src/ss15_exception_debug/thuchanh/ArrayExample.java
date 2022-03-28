package ss15_exception_debug.thuchanh;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static int[] createRandom() {
        int[] numberArr = new int[100];
        for(int i = 0; i<numberArr.length;i++) {
            numberArr[i] = (int) Math.round(Math.random()*100);
        }
        return numberArr;
    }

    public static void main(String[] args) {
        int[] checkArr = createRandom();
        System.out.println(Arrays.toString(checkArr));

        Scanner input = new Scanner(System.in);
        System.out.println("Input index to search");
        int index = input.nextInt();
        for(int i = 0)
        if (index <= checkArr.length) {
            System.out.println(checkArr[index]);
        }
        try {

        }catch (IOException e) {

        }

    }
}
