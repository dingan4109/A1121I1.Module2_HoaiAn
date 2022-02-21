package ss1_JavaIntro.ss1_javaIntro_baitap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.printf("Hello %s",name);
    }
}
