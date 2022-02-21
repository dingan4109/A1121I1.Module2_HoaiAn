package ss1_JavaIntro.ss1_javaIntro_baitap;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyTransfer {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner input = new Scanner(System.in);

        System.out.println("Input USD");
        double usd = input.nextDouble();

        double vnd = usd*rate;

        Locale vietnam = new Locale("vn","VN");
        Currency vndCurrency = Currency.getInstance(vietnam);
        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(vietnam);

        //System.out.printf("USD %f = VND %,8f",usd,vnd);
        System.out.println("USD " + usd + " = VND " + vndFormat.format(vnd));
    }
}
