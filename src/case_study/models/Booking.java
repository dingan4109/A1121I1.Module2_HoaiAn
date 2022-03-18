package case_study.models;

import java.util.Date;

public class Booking {
    private String bookingCode;
    private Date checkIn;
    private Date checkOut;
    private String customerId;
    private String service;
    private String serviceType;

    public Booking() {}

    public Booking(String bookingCode, Date checkIn, Date checkOut, String customerId, String service, String serviceType) {
        this.bookingCode = bookingCode;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.customerId = customerId;
        this.service = service;
        this.serviceType = serviceType;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
