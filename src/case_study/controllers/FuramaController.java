package case_study.controllers;

import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static final String DISPLAY_LIST_EMPLOYEES = "1. Display list employees";
    public static final String ADD_NEW_EMPLOYEE = "2. Add new employee";
    public static final String EDIT_EMPLOYEE = "3. Edit Employee";
    public static final String RETURN_MAIN_MENU = "4. Return main menu";
    public static final String DISPLAY_LIST_CUSTOMERS = "1. Display list customers";
    public static final String ADD_NEW_CUSTOMER = "2. Add new customer";
    public static final String EDIT_CUSTOMER = "3. Edit Customer";
    public static final String RETURN_MAIN_MENU1 = "4. Return main menu";
    public static final String DISPLAY_LIST_FACILITY = "1. Display list facility";
    public static final String ADD_NEW_FACILITY = "2. Add new facility";
    public static final String DISPLAY_LIST_FACILITY_MAINTENANCE = "3. Display list facility maintenance";
    public static final String RETURN_MAIN_MENU2 = "4. Return main menu";
    public static final String ADD_NEW_BOOKING = "1. Add new booking";
    public static final String DISPLAY_LIST_BOOKING = "2. Display list booking";
    public static final String CREATE_NEW_CONTRACT = "3. Create new contract";
    public static final String DISPLAY_LIST_CONTRACTS = "4. Display list contracts";
    public static final String EDIT_CONTRACTS = "5. Edit contracts";
    public static final String RETURN_TO_MAIN_MENU = "6. Return to main menu";
    public static final String DISPLAY_LIST_CUSTOMERS_USE_SERVICE = "1. Display list customers use service";
    public static final String DISPLAY_LIST_CUSTOMERS_GET_VOICHER = "1. Display list customers get voicher";
    public static final String RETURN_MAIN_MENU3 = "3. Return main menu";

    static void displayMainMenu(int choose) {
            switch (choose) {
                case 1:
                    employeeManagementMenu();
                    break;
                case 2:
                    customerManagementMenu();
                    break;
                case 3:
                    facilityManagementMenu();
                    break;
                case 4:
                    bookingManagementMenu();
                    break;
                case 5:
                    promotionManagementMenu();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Please choose again");
            }
    }

    private static void promotionManagementMenu() {
        System.out.println(DISPLAY_LIST_CUSTOMERS_USE_SERVICE);
        System.out.println(DISPLAY_LIST_CUSTOMERS_GET_VOICHER);
        System.out.println(RETURN_MAIN_MENU3);
    }

    private static void bookingManagementMenu() {
        System.out.println(ADD_NEW_BOOKING);
        System.out.println(DISPLAY_LIST_BOOKING);
        System.out.println(CREATE_NEW_CONTRACT);
        System.out.println(DISPLAY_LIST_CONTRACTS);
        System.out.println(EDIT_CONTRACTS);
        System.out.println(RETURN_TO_MAIN_MENU);
    }

    private static void facilityManagementMenu() {
        System.out.println(DISPLAY_LIST_FACILITY);
        System.out.println(ADD_NEW_FACILITY);
        System.out.println(DISPLAY_LIST_FACILITY_MAINTENANCE);
        System.out.println(RETURN_MAIN_MENU2);
    }

    private static void customerManagementMenu() {
        System.out.println(DISPLAY_LIST_CUSTOMERS);
        System.out.println(ADD_NEW_CUSTOMER);
        System.out.println(EDIT_CUSTOMER);
        System.out.println(RETURN_MAIN_MENU1);
    }

    private static void employeeManagementMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choose = 4;
        do{
            System.out.println(DISPLAY_LIST_EMPLOYEES);
            System.out.println(ADD_NEW_EMPLOYEE);
            System.out.println(EDIT_EMPLOYEE);
            System.out.println(RETURN_MAIN_MENU);
            Scanner input = new Scanner(System.in);
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    employeeService.displayList();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    check();
                    break;
            }
        }while(choose != 4);

    }

    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner input = new Scanner(System.in);
        int choose = -1;
        do{
            System.out.println("1. Display list employees");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6.Exit");
            System.out.println("\nPlease choose function");
            choose = input.nextInt();
            displayMainMenu(choose);
        } while(choose != -1);
    }
}
