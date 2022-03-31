package case_study.models;

public abstract class Facility {
    private String serviceName;
    private double usedArea;
    private double rate;
    private int standardQuantity;
    private String rentalType;

    public final String YEAR = "Rent by year";
    public final String MONTH = "Rent by month";
    public final String DAY = "Rent by day";
    public final String HOUR = "Rent by hour";

    public Facility() {}
    public Facility(String serviceName, double usedArea, double rate, int standardQuantity, String rentalType){
        this.serviceName = serviceName;
        this.usedArea = usedArea;
        this.rate = rate;
        this.standardQuantity = standardQuantity;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsedAre() {
        return usedArea;
    }

    public void setUsedAre(double usedAre) {
        this.usedArea = usedAre;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getStandardQuantity() {
        return standardQuantity;
    }

    public void setStandardQuantity(int standardQuantity) {
        this.standardQuantity = standardQuantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usedArea=" + usedArea +
                ", rate=" + rate +
                ", standardQuantity=" + standardQuantity +
                ", rentalType='" + rentalType + '\'' +
                ", ";
    }
}
