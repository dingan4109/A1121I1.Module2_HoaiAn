package case_study.models;

public class Booking{
    private String bookingCode;
    private String checkIn;
    private String checkOut;
    private Customer customer;
    private Facility service;

    public Booking() {}

    public Booking(String bookingCode, String checkIn, String checkOut, Customer customer, Facility service) {
        this.bookingCode = bookingCode;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.customer = customer;
        this.service = service;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getService() {
        return service;
    }

    public void setService(Facility service) {
        this.service = service;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", customerId='" + customer + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}
