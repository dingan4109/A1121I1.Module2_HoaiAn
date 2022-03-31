package case_study.models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floorNumber;

    public Villa() {}


    public Villa(String serviceName, double usedArea, double rate, int standardQuantity, String rentalType,
                 String roomStandard,double poolArea,int floorNumber) {
        super(serviceName,usedArea,rate,standardQuantity,rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
