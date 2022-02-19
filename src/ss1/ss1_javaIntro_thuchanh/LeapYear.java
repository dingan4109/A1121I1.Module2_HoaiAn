package ss1.ss1_javaIntro_thuchanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input year");
        int year = input.nextInt();
        //Có thể tạo thêm biến boolean result để trả về kết quả nếu muốn

        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
            System.out.printf("%d is leap year",year);
        } else {
            System.out.printf("%d is not leap year",year);
        }
    }
}
