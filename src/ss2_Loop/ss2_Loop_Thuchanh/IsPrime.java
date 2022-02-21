package ss2_Loop.ss2_Loop_Thuchanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean result = true;
        if(number <2) {
            result = false;
        } else {
            for (int i = 2;i<=Math.sqrt(number);i++) {
                if(number%i==0) result = false; break;
            }
        }

        if(result)
            System.out.printf("%d is prime",number);
        else
            System.out.printf("%d is not prime",number);
    }
}
