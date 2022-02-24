package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Scanner;

public class FindMax2D {
    public static void main(String[] args) {
        //Bước 1: Thao tác trên mảng cho sẵn
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        findMax2D(array);

        //Bước 2: User tự nhập mảng
        Scanner input = new Scanner(System.in);

        System.out.println("Input row");
        int row = input.nextInt();

        System.out.println("Input col");
        int col = input.nextInt();

        int[][] array2 = new int[row][col];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                System.out.println("Input element at [" +i + "]["+j+"]" );
                array2[i][j] = input.nextInt();
            }
        }
        findMax2D(array2);

    }
    static void findMax2D(int[][] array) {
        int max = array[0][0];
        for(int i = 0;i<array.length;i++) {
            for(int j =0; j<array[i].length;j++) {
                if(array[i][j] > max) max = array[i][j];
            }
        }
        System.out.println("Max element in array is: " + max);
    }
}
