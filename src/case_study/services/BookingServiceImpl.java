package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWrite;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner input = new Scanner(System.in);
    static Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        Customer customer1 = new Customer("001", "An", "28/10/1990", "Female", 001, 90, "an@", "member", "abc");
        Customer customer2 = new Customer("002", "Ding", "28/10/1990", "Female", 001, 90, "an@", "member", "abc");

        Facility facility1 = new Villa("a", 100, 1000, 1, "Villa", "1bed", 50, 1);
        Facility facility2 = new Villa("b", 100, 1000, 1, "Villa", "1bed", 50, 1);

        customerList.add(customer1);
        customerList.add(customer2);

        facilityList.put(facility1, 0);
        facilityList.put(facility2, 0);

    }

    public static Set<Booking> getBookingList() {
        return bookingList;
    }

    @Override
    public void displayList() {
//        for (Booking booking : bookingList) {
//            System.out.println(booking.toString());
//        }

        ReadAndWrite.readTextFileString("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\booking" +
                ".csv");
    }

    public void displayMaintenanceList() {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "\tValue: " + entry.getValue());
        }
    }

    @Override
    public void addNew() {
        Customer customer = getCustomer();
        Facility facility = getFacility();

        try {
            System.out.println("Input booking code");
            String bookingCode = input.nextLine();
            System.out.println("Input check in date");
            String checkIn = input.nextLine();
            System.out.println("Input check out date");
            String checkOut = input.nextLine();

            Booking booking = new Booking(bookingCode, checkIn, checkOut, customer, facility);
            bookingList.add(booking);

            ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\booking" +
                    ".csv");
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }

    }

    public static Customer getCustomer() {
        System.out.println("Customer list");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        try {
            System.out.println("Choose customer id");
            String id = input.nextLine();

            boolean check = true;

            while (check) {
                for (Customer customer : customerList) {
                    if (customer.getId().equals(id)) {
                        check = false;
                        return customer;
                    }
                }
                if (check) {
                    System.out.println("Choose id again");
                    id = input.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
        return null;
    }

    public Facility getFacility() {
        System.out.println("Facility list");
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            System.out.println(entry.getKey().toString());
        }

        try {
            System.out.println("Choose facility name");
            String key = input.nextLine();

            boolean check = true;
            while (check) {
                for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
                    if (entry.getKey().getServiceName().equals(key)) {
                        check = false;
                        entry.setValue(entry.getValue() + 1);
                        return entry.getKey();
                    }
                }
                if (check) {
                    System.out.println("Choose facility name");
                    key = input.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
        return null;
    }

    @Override
    public void edit() {

    }
}
