package case_study.models;

public class Contract {
    private String contractNumber;
    private Booking booking;
    private int deposit;
    private int totalBookingValue;

    public Contract() {}

    public Contract(String contractNumber, Booking booking, int deposit, int totalBookingValue) {
        this.contractNumber = contractNumber;
        this.booking = booking;
        this.deposit = deposit;
        this.totalBookingValue = totalBookingValue;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Booking getBookingCode() {
        return booking;
    }

    public void setBookingCode(Booking booking) {
        this.booking = booking;
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



    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", booking=" + booking +
                ", deposit=" + deposit +
                ", totalBookingValue=" + totalBookingValue +
                '}';
    }
}
