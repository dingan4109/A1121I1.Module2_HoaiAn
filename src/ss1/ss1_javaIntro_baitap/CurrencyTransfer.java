package ss1.ss1_javaIntro_baitap;

import java.util.Scanner;

public class CurrencyTransfer {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner input = new Scanner(System.in);

        System.out.println("Input USD");
        double usd = input.nextDouble();

        double vnd = usd*rate;

        //System.out.printf("USD %f = VND %,8f",usd,vnd);
        System.out.println("USD " + usd + " = VND " + vnd);
    }
}
