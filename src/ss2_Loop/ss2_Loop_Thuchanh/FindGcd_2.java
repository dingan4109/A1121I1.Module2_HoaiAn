package ss2_Loop.ss2_Loop_Thuchanh;

import java.util.Scanner;

public class FindGcd_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println('a');
        int a = input.nextInt();

        System.out.println('b');
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 && b==0) {
            System.out.println("No");
        } else if(a==0 || b == 0) {
            if(a==0) System.out.println(b);
            else System.out.println(a);;
        }else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.println(a);
        }
    }
}
