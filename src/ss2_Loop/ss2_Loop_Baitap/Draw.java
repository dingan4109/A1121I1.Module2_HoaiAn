package ss2_Loop.ss2_Loop_Baitap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        String draw;

        while(choice!=0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("4. Draw the equilateral triangle");
            System.out.println("5. Exit");

            System.out.println("Enter your choice");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the reatangle");
                    for(int height = 0;height<3;height++){
                        draw = "";
                        for(int width = 0;width<6;width++) {
                            draw += "* ";
                        } System.out.println(draw);
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    draw = "";
                    for(int i = 0; i<5;i++) {
                        draw += "*";
                        System.out.println(draw);
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for(int height = 0;height<5;height++) {
                        draw = "";
                        for(int width = 0; width<(5-height);width++) {
                            draw += "*";
                        }
                        System.out.println(draw);
                    }
                    break;
                case 4:
                    System.out.println("Draw the equilateral triangle");
                    for(int height = 1;height<=5;height++) {
                        draw = "";
                        for(int i = 0;i<(5-height);i++){
                            draw += " ";
                        }
                        for(int j = 0; j<(height*2)-1;j++) {
                            draw += "*";
                        }
                        System.out.println(draw);
                    }
                    break;
                case 5:
                    System.exit(5);
            }
        }
    }
}
