package ss1_JavaIntro.ss1_javaIntro_thuchanh;

import java.util.Scanner;

public class FindDaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tháng");
        int month = input.nextInt();
        String daysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 2:
                daysInMonth = "28 hoặc 29";
                break;
            default:
                daysInMonth = " ";
        }
        if(!daysInMonth.equals(" "))
        System.out.printf("Tháng %d có %s ngày",month,daysInMonth);
        else System.out.println("Vui lòng nhập lại tháng đúng");
    }
}
