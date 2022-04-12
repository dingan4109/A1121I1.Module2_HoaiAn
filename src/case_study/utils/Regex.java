package case_study.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner input = new Scanner(System.in);

    private static final String VILLA_CODE = "^SVVL-\\d{4}$";
    private static final String HOUSE_CODE = "^SVHO-\\d{4}$";
    private static final String ROOM_CODE = "^SVRO-\\d{4}$";
    private static final String NAME = "^[A-Z][a-z]+$";
    private static final String DATE = "^(0?[1-9]|[1-2]\\d|3[0-1])/(0?[1-9]|1[0-2])/[1-9]\\d{3}$";


    public Regex() {
    }

    public static boolean villaValidate(String regex) {
        return Pattern.matches(VILLA_CODE, regex);
    }

    public static boolean houseValidate(String regex) {
        return Pattern.matches(HOUSE_CODE, regex);
    }

    public static boolean roomValidate(String regex) {
        return Pattern.matches(ROOM_CODE, regex);
    }

    public static void areaValidate(double area) {
        while (area <= 30) {
            System.out.println("Area must be greater than 30m2");
            area = input.nextDouble();
        }
    }

    public static void rateValidate(double rate) {
        while (rate < 0) {
            System.out.println("Rate must be positive amount");
            rate = input.nextDouble();
        }
    }

    public static void standardQuantityValidate(int qty) {
        while (qty <= 0 || qty >= 20) {
            System.out.println("Standard quantity must be in between 1 and 19");
            qty = input.nextInt();
        }
    }

    public static void floorValidate(int floor) {
        while (floor < 0) {
            System.out.println("Floor must be positive number");
            floor = input.nextInt();
        }
    }

    public static boolean nameValidate(String regex) {
        return Pattern.matches(NAME, regex);
    }

    public static boolean dateValidate(String date) {
        return Pattern.matches(DATE, date);
    }

    public static void birthdayCheck(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate bday = LocalDate.parse(birthday, formatter);
        int currentYear = LocalDate.now().getYear();

        int gap = currentYear - bday.getYear();
        if (gap < 18 || gap > 100) {
            try {
                throw new UserException("Age must be greater than 18 and less than 100");
            } catch (UserException e) {
                e.printStackTrace();
            }
        }


    }

}
