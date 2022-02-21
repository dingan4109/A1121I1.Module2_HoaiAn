package ss2_Loop.ss2_Loop_Baitap;

import java.util.Scanner;

public class primesSmallerThanN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n");
        int n = input.nextInt();
        int check;
        for(int i = 2;i<=n;i++) {
            check = 0;
            for(int j = 2;j<= Math.sqrt(i);j++) {
                if(i%j == 0) {check = 1;break;}
            } if (check == 0) {
                System.out.println(i);}
        }
    }
}
