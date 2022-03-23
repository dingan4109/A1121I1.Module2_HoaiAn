package ss13_searchingAgorithm.baitap;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        String str = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        final int length = str.length();
        for(int i = 0; i< length; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for(int j = i+1; j<length; j++) {
                if(str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }

            if(list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for(Character i : max) {
            System.out.print(i);
        }
    }
}
