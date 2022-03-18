package case_study.models;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private int deposit;
    private int totalBookingValue;
    private String customerId;

    public Contract() {}

    public Contract(String contractNumber, String bookingCode, int deposit, int totalBookingValue, String customerId) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalBookingValue = totalBookingValue;
        this.customerId = customerId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalBookingValue() {
        return totalBookingValue;
    }

    public void setTotalBookingValue(int totalBookingValue) {
        this.totalBookingValue = totalBookingValue;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
