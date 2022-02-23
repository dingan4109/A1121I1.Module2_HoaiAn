package ss2_Loop.ss2_Loop_Thuchanh;

import java.util.Scanner;

public class FindGcd {
    public static void main(String[] args) {
        //Find Greatest Common Divisor
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
            a= Math.abs(a);
        System.out.println("Input b");
        int b = input.nextInt();
            b = Math.abs(b);
        int gcd = 0;

        if(a==0 && b==0) {
            gcd = -1;
        }else if(a==0 || b==0) {
            if(a==0) gcd = b;
                else gcd = a;
        }else {
                for (int i = 1; i <= Math.min(a,b); i++) {
                    if (a % i == 0 && b % i == 0) gcd = i;
                }
            }

        if(gcd == -1) {
            System.out.println("There is no GCD between " + a + " and " + b);
        }else {
            System.out.printf("GCD of %d and %d is %d",a,b,gcd);
        }
    }
}
