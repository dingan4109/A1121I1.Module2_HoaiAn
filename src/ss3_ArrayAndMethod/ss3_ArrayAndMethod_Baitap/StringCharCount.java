package ss3_ArrayAndMethod.ss3_ArrayAndMethod_Baitap;

import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        String s = "Hello CodeGym";

        System.out.println("Input character to compare");
        char character = input.nextLine().charAt(0);
        int count = 0;

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == character) count+=1;
        }
        System.out.printf("%s appears %d time",character,count);
    }

    //Nếu compare ignore char case thì convert string sang hêt 1 loại case..?
}
