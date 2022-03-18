package ss10_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere saw Elba";
        Stack<Character> firstHaft = new Stack<>();
        Queue<Character> secondHaft = new LinkedList<>();
        for(int i = 0; i <str.length();i++) {
            if(i < str.length()/2) {
                firstHaft.push(str.charAt(i));
            }
            if(i>str.length()/2) {
                secondHaft.add(str.charAt(i));
            }
        }
    }
}
