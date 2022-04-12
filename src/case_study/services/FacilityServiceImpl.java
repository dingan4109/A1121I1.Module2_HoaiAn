package case_study.services;

import case_study.controllers.FuramaController;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static final int VILLA = 1;
    public static final int HOUSE = 2;
    public static final int ROOM = 3;
    static Scanner input = new Scanner(System.in);
    private static Map<Facility, Integer> facilityServiceList = new LinkedHashMap<>();
    static List<Villa> villas = new ArrayList<>();
    static List<House> houses = new ArrayList<>();
    static List<Room> rooms = new ArrayList<>();

    public static List<Villa> getVillas() {
        return villas;
    }

    public static List<House> getHouses() {
        return houses;
    }

    public static List<Room> getRooms() {
        return rooms;
    }

    @Override
    public void displayListMaintenance() {
        List<Facility> maintenanceList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : facilityServiceList.entrySet()) {
            if (entry.getValue() == 5) {
                maintenanceList.add(entry.getKey());
            }
        }

        for (Facility facility : maintenanceList) {
            System.out.println(facility);
        }
    }

    @Override
    public Facility getFacility(int choose) {
        try {
            System.out.println("Input service name");
            String serviceName = input.nextLine();

            switch (choose) {
                case VILLA:
                    while(!Regex.villaValidate(serviceName)) {
                        System.out.println("Input villa code");
                        serviceName = input.nextLine();
                    }
                    break;
                case HOUSE:
                    while(!Regex.houseValidate(serviceName)) {
                        System.out.println("Input house code");
                        serviceName = input.nextLine();
                    }
                    break;
                case ROOM:
                    while(!Regex.roomValidate(serviceName)) {
                        System.out.println("Input room code");
                        serviceName = input.nextLine();
                    }
                    break;
            }


            System.out.println("Input used Area");
            double usedArea = Double.parseDouble(input.nextLine());
            Regex.areaValidate(usedArea);

            System.out.println("Input rate");
            double rate = Double.parseDouble(input.nextLine());
            Regex.rateValidate(rate);

            System.out.println("Input standard quantity");
            int standardQuantity = Integer.parseInt(input.nextLine());
            Regex.standardQuantityValidate(standardQuantity);

            System.out.println("Input rental type");
            String rentalType = input.nextLine();
            while(!Regex.nameValidate(rentalType)) {
                System.out.println("Input again");
                rentalType = input.nextLine();
            }

            if (choose == VILLA) {
                System.out.println("Input room standard");
                String roomStandard = input.nextLine();
                while(!Regex.nameValidate(roomStandard)) {
                    System.out.println("Input again");
                    roomStandard = input.nextLine();
                }

                System.out.println("Input pool area");
                double poolArea = Double.parseDouble(input.nextLine());
                Regex.areaValidate(poolArea);

                System.out.println("Input floor number");
                int floorNumber = Integer.parseInt(input.nextLine());
                Regex.floorValidate(floorNumber);

                Villa villa = new Villa(serviceName, usedArea, rate, standardQuantity, rentalType, roomStandard,
                        poolArea,
                        floorNumber);

                villas.add(villa);
                ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1" +
                        ".Module2_HoaiAn\\src\\case_study\\data\\villa.csv");
                return villa;

            } else if (choose == HOUSE) {
                System.out.println("Input room standard");
                String roomStandard = input.nextLine();
                while(!Regex.nameValidate(roomStandard)) {
                    System.out.println("Input again");
                    roomStandard = input.nextLine();
                }

                System.out.println("Input floor number");
                int floorNumber = Integer.parseInt(input.nextLine());
                Regex.floorValidate(floorNumber);

                House house = new House(serviceName, usedArea, rate, standardQuantity, rentalType, roomStandard,
                        floorNumber);

                houses.add(house);
                ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1" +
                        ".Module2_HoaiAn\\src\\case_study\\data\\house.csv");
                return house;

            } else {//ROOM
                System.out.println("Input complimentary service");
                String complimentaryService = input.nextLine();

                Room room = new Room(serviceName, usedArea, rate, standardQuantity, rentalType, complimentaryService);

                rooms.add(room);
                ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\room" +
                        ".csv");
                return room;
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }

        return null;
    }

    @Override
    public void displayList() {
        //Map Key: Service name (Obj Villa,House,Room) - Value: Used time
//        Set<Map.Entry<Facility, Integer>> entrySet = facilityServiceList.entrySet();
        for (Map.Entry<Facility, Integer> facility : facilityServiceList.entrySet()) {
            System.out.println(facility.getKey());
            System.out.println(facility.getValue());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Choose your service");
        int choose = 4;
        do {
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");

            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    Villa villa = (Villa) getFacility(1);
                    facilityServiceList.put(villa, 0);
                    break;
                case 2:
                    House house = (House) getFacility(2);
                    facilityServiceList.put(house, 0);
                    break;
                case 3:
                    Room room = (Room) getFacility(3);
                    facilityServiceList.put(room, 0);
                    break;
                case 4:
                    FuramaController.facilityManagementMenu();
                    break;
                default:
                    System.out.println("Choose again");
            }
        } while (choose != 4);

    }

    @Override
    public void edit() {
        System.out.println("Input service name to edit");
    }
}
