package ss15_exception_debug.thuchanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = input.nextInt();
        System.out.println("Input y: ");
        int y = input.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);

    }

    public void calculate(int x, int y) {
        try{
            int sum = x + y;
            int sub  = x - y;
            int mul = x * y;
            int div = x / y;

            System.out.println("Sum of x and y: " + sum);
            System.out.println("Difference of x and y: " + sub);
            System.out.println("Product of x and y: " + mul);
            System.out.println("Quotient of x and y: " + div);
        }catch (ArithmeticException e) {
            //Already catch here
            System.out.println("Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("check");
        }
    }
}
