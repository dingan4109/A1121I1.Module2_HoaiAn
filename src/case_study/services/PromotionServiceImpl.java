package case_study.services;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Villa;
import case_study.utils.BookingComparator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PromotionServiceImpl implements PromotionService {
    static Scanner input = new Scanner(System.in);
    static Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new LinkedList<>();

    {
        Customer customer1 = new Customer("001","An","28/10/1990","Female",001,90,"an@","member","abc");
        Customer customer2 = new Customer("002","Ding","28/10/1990","Female",001,90,"an@","member","abc");
        Customer customer3 = new Customer("003","Ding","28/10/1990","Female",001,90,"an@","member","abc");
        Customer customer4 = new Customer("004","Ding","28/10/1990","Female",001,90,"an@","member","abc");

        Facility facility1 = new Villa("a",100,1000,1,"Villa","1bed",50,1);
        Facility facility2 = new Villa("b",100,1000,1,"Villa","1bed",50,1);


        //bookingCode,checkIn,checkOut, customer,facility
        Booking booking1 = new Booking("001","1/2/2021","13/2/2021",customer1,facility1);
        Booking booking2 = new Booking("002","12/3/2021","15/3/2021",customer2,facility1);
        Booking booking3 = new Booking("003","10/2/2022","13/2/2022",customer2,facility2);
        Booking booking4 = new Booking("004","1/4/2022","12/4/2022",customer1,facility2);
        Booking booking5 = new Booking("005","2/4/2022","3/4/2022",customer2,facility2);
        Booking booking6 = new Booking("006","3/4/2022","4/4/2022",customer3,facility2);
        Booking booking7 = new Booking("007","4/4/2022","4/4/2022",customer4,facility2);

        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);
        bookingList.add(booking4);
        bookingList.add(booking5);
        bookingList.add(booking6);
        bookingList.add(booking7);
    }

    @Override
    public void displayCustomerUseService() {
        System.out.println("Input year");
        int year = input.nextInt();

        Set<Booking> bookings = getBookingByYear(year);
        for(Booking booking : bookings){
            customerList.add(booking.getCustomer());
        }
        for(Customer customer : customerList) {
            System.out.println("Customer using service list in year " + year);
            System.out.println(customer.toString());
        }
    }

    @Override
    public void displayCustomerGetVoucher() {
        Stack<Booking> bookings = getCurrentMonthBookings();
        for(Booking booking : bookings) {
            System.out.println(booking.toString());
        }
        List<Customer> customersGetVoucher10 = new LinkedList<>();
        List<Customer> customersGetVoucher20 = new LinkedList<>();
        List<Customer> customersGetVoucher50 = new LinkedList<>();

        System.out.println("Input quantity of voucher 10%");
        int voucher10 = input.nextInt();

        System.out.println("Input quantity of voucher 20%");
        int voucher20 = input.nextInt();

        System.out.println("Input quantity of voucher 50%");
        int voucher50 = input.nextInt();

        int totalVoucher = voucher10 + voucher20 + voucher50;

        for(int i = 0; i < totalVoucher; i++) {
            if(i<voucher10) {
                customersGetVoucher10.add(bookings.pop().getCustomer());
            }else if(i < (voucher10 + voucher20)) {
                customersGetVoucher20.add(bookings.pop().getCustomer());
            }else {
                customersGetVoucher50.add(bookings.pop().getCustomer());
            }
        }
        System.out.println("Customers get voucher 10%");
        for(Customer customer : customersGetVoucher10) {
            System.out.println(customer.toString());
        }

        System.out.println("Customers get voucher 20%");
        for(Customer customer : customersGetVoucher20) {
            System.out.println(customer.toString());
        }

        System.out.println("Customers get voucher 50%");
        for(Customer customer : customersGetVoucher50) {
            System.out.println(customer.toString());
        }
    }

    public Stack<Booking> getCurrentMonthBookings() {
        Stack<Booking> bookings = new Stack<>();
        for(Booking booking : bookingList) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyy");
            LocalDate checkIn = LocalDate.parse(booking.getCheckIn(),formatter);
            int currentMonth = LocalDate.now().getMonthValue();

            if(checkIn.getMonthValue() == currentMonth) {
                bookings.push(booking);
            }
        }
        return bookings;
    }

    public Set<Booking> getBookingByYear(int year) {

        Set<Booking> bookings = new TreeSet<>(new BookingComparator());

        for(Booking booking : bookingList) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyy");
            LocalDate checkIn = LocalDate.parse(booking.getCheckIn(),formatter);

            if(checkIn.getYear() == year) {
                bookings.add(booking);
            }
        }
        return bookings;
    }
}
