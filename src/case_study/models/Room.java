package case_study.models;

public class Room extends Facility{
    private String complimentaryService;

    public Room() {}

    public Room(String serviceName, double usedArea, double rate, int standardQuantity, String rentalType, String complimentaryService) {
        super(serviceName, usedArea, rate, standardQuantity, rentalType);
        this.complimentaryService = complimentaryService;
    }

    public String getComplimentaryService() {
        return complimentaryService;
    }

    public void setComplimentaryService(String complimentaryService) {
        this.complimentaryService = complimentaryService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "complimentaryService='" + complimentaryService + '\'' +
                '}';
    }
}
