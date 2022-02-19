package ss1.ss1_javaIntro_thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập a");
        double a = input.nextDouble();

        System.out.println("Nhập b");
        double b = input.nextDouble();

        if(a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b/a;
            System.out.println("Phương trình có một nghiệm là: " + x);
        }

    }
}
