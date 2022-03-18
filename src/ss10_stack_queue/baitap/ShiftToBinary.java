package ss10_stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ShiftToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to shift to binary");
        int number = input.nextInt();
        Stack<Integer> binary = new Stack<>();

        while(number!=0) {
            binary.push(number%2);
            number = number/2;
        }

        while(!binary.empty()) {
            System.out.print(binary.pop());
        }

    }
}
