package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Thuchanh;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExchangeTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice!=0) {
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Input choice");
            choice = input.nextInt();

            double result;
            switch (choice) {
                case 1:
                    System.out.println("Exchange F to C");
                    double f = input.nextDouble();
//                    result = toC(f);
//                    System.out.printf("%.0fF is %.0fC%n",f,result);
                    System.out.println(f + "F = " + toC(f) + "C");
                    break;
                case 2:
                    System.out.println("Exchange C to F");
                    double c = input.nextDouble();
                    result = toF(c);
                    System.out.printf("%.0fC is %.0fF%n",c,result);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    static double toF(double c) {
        double f = c/(5f/9) + 32;
        return f;
    }
    static double toC(double f) {
        double c = (5f/9)*(f-32);
        return c;
    }
}
