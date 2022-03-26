package ss6_Inheritance.Baitap;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle a = new Triangle();
        System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.println("Input x");
        double x = input.nextDouble();
        System.out.println("Input y");
        double y = input.nextDouble();
        System.out.println("Input z");
        double z = input.nextDouble();

        if((x+y)>z && (x+z)>y && (y+z)>x) {
            Triangle b = new Triangle(x,y,z);
            System.out.println(b);
        } else System.out.println("Not valid sides of a Triangle");

    }
}
