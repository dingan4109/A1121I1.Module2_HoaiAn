package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        //Chỉ xóa được phần từ 1 lần duy nhất, không xử lý được trường hợp xóa hết toàn bộ các phần tử giống với
        // input element
        Scanner input = new Scanner(System.in);

        System.out.println("Input element to delete");
        int element = input.nextInt();

        int[] array = {1,2,3,4,0,0,8,9};
        int indexDel=-1;
        for(int i = 0;i<array.length;i++) {
            if(array[i] == element) {
                indexDel = i; break;
            }
        }


        int[] array2 = new int[array.length-1];
        if(indexDel!= -1) {
            int j = 0;
            for (int i = 0;i<array.length;i++) {
                if(i==indexDel) {continue;}
                array2[j++] = array[i];
            } System.out.println("New array: " + Arrays.toString(array2));
        }else {
            System.out.println("Element is not found");
        }

    }
}
