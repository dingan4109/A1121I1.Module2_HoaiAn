package ss1.ss1_javaIntro_thuchanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input weight");
        double weight = input.nextDouble();

        System.out.println("Input height");
        double height = input.nextDouble();

        double bmi = weight/Math.pow(height,2);
        String result;
        if(bmi<18.5) {
            result = "Underweight";
        } else if (bmi<25) {
            result = "Normal";
        } else if (bmi<30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        System.out.printf("Your BMI is %f and you are %s",bmi,result);

    }
}
