package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Bước 1: Thao tác trên mảng có sẵn
        double[][] array = {
                {1,2,3,4},
                {11,12,27,14},
                {21,11,23,24},
                {35,32,33,34},
        };
        sumDiagonal1(array);

        //Bước 2: User tự nhập mảng
        System.out.println("Input size");
        int size = input.nextInt();

        double[][] array2 = new double[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.println("Input element at [" +i + "]["+j+"]");
                array2[i][j] = input.nextInt();
            }
        }
        sumDiagonal2(array2);
    }

    //Sum chéo 0,1,2,3
    static void sumDiagonal1(double[][] array) {
        int sum=0;
        for(int i = 0;i<array.length;i++) {
            sum+= array[i][i];
        }
        System.out.println("Sum of diagonal elements is " + sum);
    }

    //Sum chéo 3,2,1,0
    static void sumDiagonal2(double[][] array) {
        int sum=0;
        int j = array.length-1;
        for(int i = 0;i<array.length;i++) {
            sum+= array[i][j-i];
        }
        System.out.println("Sum of diagonal elements is " + sum);
    }

}
