package ss1.ss1_javaIntro_thuchanh;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width");
        width = scanner.nextFloat();

        System.out.println("Input height");
        height = scanner.nextFloat();

        float result = width*height;
        System.out.println("Area is: " + result);

    }
}
