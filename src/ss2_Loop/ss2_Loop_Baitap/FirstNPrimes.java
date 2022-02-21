package ss2_Loop.ss2_Loop_Baitap;

import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input n");
        int n = input.nextInt();
        int check = 0;
        int count = 0;

            for(int i = 2;i>0;i++) {
                check = 0;
                for(int j = 2;j<=Math.sqrt(i);j++) {
                    if(i%j==0) {check = 1;break;}
                } if(check == 0) {
                    System.out.println(i);
                    count +=1;
                }
            if (count == n) break;
        }
    }
}
