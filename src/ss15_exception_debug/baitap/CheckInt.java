package ss15_exception_debug.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInt{
    /*Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
    Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("input x: ");
            int x = input.nextInt();
            System.out.print("input y: ");
            int y = input.nextInt();

            try{
                int div = x / y;
                System.out.println("Quotient of x and y is " + div);
            }catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }catch (InputMismatchException e) {
            System.out.println("Not an integer");
        }
       System.out.println("Check line --------------");

    }
}


