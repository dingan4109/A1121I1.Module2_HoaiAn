package ss15_exception_debug.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArr extends Exception{
    /*Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng. Bắt ngoại lệ nếu nhập phần từ có giá trị là 100 thì in ra các phần tử đã nhập và kết thúc chương trình*/
    static Scanner input = new Scanner(System.in);

    public PrintArr() {
        super();
    }

    public PrintArr(String mess) {
        super(mess);
    }

    public static void checkInput(int number) throws PrintArr {
        if(number == 100) throw new PrintArr("Input number is 100");
    }

    public static void main(String[] args) {
        System.out.print("Input n: ");
        int n = input.nextInt();
        int[] nArray = new int[n];

        for(int i = 0; i<nArray.length;i++) {
            System.out.println("Input number at " + i);
                int number = input.nextInt();
            try {
                checkInput(number);
                nArray[i] = number;
            } catch (PrintArr printArr) {
                System.out.println("Exception: " + printArr.getMessage());
                break;
            }
        }
        System.out.println(Arrays.toString(nArray));
    }
}
