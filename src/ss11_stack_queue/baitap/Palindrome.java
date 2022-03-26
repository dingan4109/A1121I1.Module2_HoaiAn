package ss11_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        String inputStr = input.nextLine();
        String str = inputStr.replaceAll("\\s","").toLowerCase();

//        String str = "Able was I ere I saw Elba";

        Stack<Character> firstHaft = new Stack<>();
        Queue<Character> secondHaft = new LinkedList<>();
        final int length = str.length();
        final int halfLength = length / 2;


        for(int i = 0; i < length; i++) {
            if(i < halfLength) {
                firstHaft.push(str.charAt(i));
            }
            if(i == halfLength && length%2==0 || i > halfLength) {
                    secondHaft.add(str.charAt(i));
            }
        }
        System.out.println(firstHaft);
        System.out.println(secondHaft);

        boolean check = true;
        for(int i = 0; i < halfLength;i++){
            if(firstHaft.pop()!=secondHaft.poll()) {
                check = false;
                break;
            }
        }
        if(!check) {
            System.out.println("Not a palindrome");
        } else {
            System.out.println("Is a palindrome");
        }
    }
}
