package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int floorNumber;

    public House() {}

    public House(String serviceName, double usedArea, double rate, int standardQuantity, String rentalType, String roomStandard, int floorNumber) {
        super(serviceName, usedArea, rate, standardQuantity, rentalType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
