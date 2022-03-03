package ss1_JavaIntro.ss1_javaIntro_baitap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int number = input.nextInt();
        String result = "";
        String first_digit = "";
        String second_digit = "";
        String third_digit = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "night";
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number % 10) {
                case 0:
                    result = "ten";
                    break;
                case 1:
                    result = "eleven";
                    break;
                case 2:
                    result = "twelve";
                    break;
                case 3:
                    result = "thirteen";
                    break;
                case 4:
                    result = "fourteen";
                    break;
                case 5:
                    result = "fifteen";
                    break;
                case 6:
                    result = "sixteen";
                    break;
                case 7:
                    result = "seventeen";
                    break;
                case 8:
                    result = "eighteen";
                    break;
                case 9:
                    result = "nineteen";
                    break;
            }
        } else if (number >= 20) {
            if (number < 100) {
                switch (number / 10) {
                    case 2:
                        first_digit = "twenty";
                        break;
                    case 3:
                        first_digit = "thirty";
                        break;
                    case 4:
                        first_digit = "fourty";
                        break;
                    case 5:
                        first_digit = "fifty";
                        break;
                    case 6:
                        first_digit = "sixty";
                        break;
                    case 7:
                        first_digit = "seventy";
                        break;
                    case 8:
                        first_digit = "eighty";
                        break;
                    case 9:
                        first_digit = "ninety";
                        break;
                }
                switch (number % 10) {
                    case 1:
                        second_digit = "one";
                        break;
                    case 2:
                        second_digit = "two";
                        break;
                    case 3:
                        second_digit = "three";
                        break;
                    case 4:
                        second_digit = "four";
                        break;
                    case 5:
                        second_digit = "five";
                        break;
                    case 6:
                        second_digit = "six";
                        break;
                    case 7:
                        second_digit = "seven";
                        break;
                    case 8:
                        second_digit = "eight";
                        break;
                    case 9:
                        second_digit = "night";
                        break;
                }
                result = first_digit + " " + second_digit;
            } else if (number < 1000) {
                switch (number / 100) {
                    case 1:
                        first_digit = "one hundred";
                        break;
                    case 2:
                        first_digit = "two hundreds";
                        break;
                    case 3:
                        first_digit = "three hundreds";
                        break;
                    case 4:
                        first_digit = "four hundreds";
                        break;
                    case 5:
                        first_digit = "five hundreds";
                        break;
                    case 6:
                        first_digit = "six hundreds";
                        break;
                    case 7:
                        first_digit = "seven hundreds";
                        break;
                    case 8:
                        first_digit = "eigh hundreds";
                        break;
                    case 9:
                        first_digit = "nine hundreds";
                        break;
                }
                switch ((number / 10) % 10) {
                    case 2:
                        second_digit = "twenty";
                        break;
                    case 3:
                        second_digit = "thirty";
                        break;
                    case 4:
                        second_digit = "fourty";
                        break;
                    case 5:
                        second_digit = "fifty";
                        break;
                    case 6:
                        second_digit = "sixty";
                        break;
                    case 7:
                        second_digit = "seventy";
                        break;
                    case 8:
                        second_digit = "eighty";
                        break;
                    case 9:
                        second_digit = "ninety";
                        break;
                }
                switch (number % 10) {
                    case 1:
                        third_digit = "one";
                        break;
                    case 2:
                        third_digit = "two";
                        break;
                    case 3:
                        third_digit = "three";
                        break;
                    case 4:
                        third_digit = "four";
                        break;
                    case 5:
                        third_digit = "five";
                        break;
                    case 6:
                        third_digit = "six";
                        break;
                    case 7:
                        third_digit = "seven";
                        break;
                    case 8:
                        third_digit = "eight";
                        break;
                    case 9:
                        third_digit = "night";
                        break;
                }
                if (number % 100 == 0) {
                    result = first_digit;
                } else {
                    result = first_digit + " and " + second_digit + third_digit;
                }
            } else result = "Out of ability";
        }
        System.out.println(result);
    }
}
