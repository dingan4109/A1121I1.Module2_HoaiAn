package ss15_exception_debug.thuchanh;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    //Cách 1
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

        try{
            System.out.println(checkArr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.toString());

            do{
                System.out.println("Input index again");
                index = input.nextInt();
            }while(index <0 || index >=100);

            System.out.println(checkArr[index]);
        }
// Cách 2
//    public static Integer[] createRandom2() {
//        Random random = new Random();
//        Integer[] integerArr = new Integer[100];
//        System.out.println("Array elements");
//        for(int i = 0; i<integerArr.length;i++) {
//            integerArr[i] = random.nextInt(100);
//        }
//        return integerArr;
//    }

//    public static void main(String[] args) {
//        Integer[] checkArr = createRandom2();
//        System.out.println(Arrays.toString(checkArr));
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input index to search");
//        int index = input.nextInt();
//
//        try{
//            System.out.println(checkArr[index]);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println(e.toString());
//
//            do{
//                System.out.println("Input index again");
//                index = input.nextInt();
//            }while(index <0 || index >100);
//
//            System.out.println(checkArr[index]);
//        }


    }
}
