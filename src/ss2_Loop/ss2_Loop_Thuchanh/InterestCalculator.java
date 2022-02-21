package ss2_Loop.ss2_Loop_Thuchanh;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input money");
        double money = input.nextDouble();

        System.out.println("Input interest rate");
        double interestRate = input.nextDouble();

        System.out.println("Input month");
        int month = input.nextInt();

        double interest = money*(interestRate/100)/12*month;
        double sum = 0;
        for(int i = 0; i<month;i++) {
            sum += interest;
        }

        Locale vietnam = new Locale("nv","VN");
        Currency vnd = Currency.getInstance(vietnam);
        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(vietnam);
        System.out.println("Total of interest: " + vndFormat.format(sum));

    }
}
