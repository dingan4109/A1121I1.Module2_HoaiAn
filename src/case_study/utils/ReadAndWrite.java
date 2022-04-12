package case_study.utils;

import case_study.models.*;
import case_study.services.*;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    //CHARACTER STREAM
    public static final String SEPERATOR = ",";

    public static void writeTextFile(String filepath) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filepath));

            if (filepath.contains("employee.csv")) {
                List<Employee> list = EmployeeServiceImpl.getEmployeeList();
                //String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber, String email, String educationLevel, String position, int salary
                for (Employee employee : list) {
                    bufferedWriter.write("ID: " + employee.getId() + SEPERATOR + "Fullname: " + employee.getFullName() + SEPERATOR + "Birthday: " + employee.getBirthday() + SEPERATOR + "Gender: " + employee.getGender() + SEPERATOR + "ID Card Number: " + employee.getIdCardNumber() + SEPERATOR + "Phone Number: " + employee.getPhoneNumber() + SEPERATOR + "Email: " +employee.getEmail() + SEPERATOR + "Education Level: " + employee.getEducationLevel() + SEPERATOR + "Position: " + employee.getPosition() + SEPERATOR + "Salary: " + employee.getSalary());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("customer.csv")) {
                List<Customer> list = CustomerServiceImpl.getCustomerList();

                //String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber,
                // String email, String type, String address
                for (Customer customer : list) {
                    bufferedWriter.write("ID: " + customer.getId() + SEPERATOR + "Fullname: " + customer.getFullName() + SEPERATOR + "Birthday: " + customer.getBirthday() + SEPERATOR + "Gender: " + customer.getGender() + SEPERATOR + "ID Card Number: " + customer.getIdCardNumber() + SEPERATOR + "Phone Number: " + customer.getPhoneNumber() + SEPERATOR + "Email: " + customer.getEmail() + SEPERATOR + "Type: " + customer.getType() + SEPERATOR + "Address: " + customer.getAddress());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("contract.csv")) {
                Set<Contract> list = ContractServiceImpl.getContractList();

                //String contractNumber, Booking booking, int deposit, int totalBookingValue
                for (Contract contract : list) {
                    bufferedWriter.write("Contract Number: " + contract.getContractNumber() + SEPERATOR + "Booking: " + contract.getBooking() + SEPERATOR + "Deposit: " + contract.getDeposit() + SEPERATOR + "Total Booking Value: " + contract.getTotalBookingValue());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("booking.csv")) {
                Set<Booking> list = BookingServiceImpl.getBookingList();

                //String bookingCode, String checkIn, String checkOut, Customer customer, Facility service
                for (Booking booking : list) {
                    bufferedWriter.write("Booking Code: " + booking.getBookingCode() + SEPERATOR + "Check In: " + booking.getCheckIn() + SEPERATOR + "Check Out: " + booking.getCheckOut() + SEPERATOR + "Customer: " + booking.getCustomer() + SEPERATOR + "Service: " + booking.getService());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("villa.csv")) {
                List<Villa> list = FacilityServiceImpl.getVillas();
                //String serviceName, double usedArea, double rate, int standardQuantity, String rentalType,String roomStandard,double poolArea,int floorNumber
                for (Villa villa : list) {
                    bufferedWriter.write("Service Name: " + villa.getServiceName() + SEPERATOR + "Used Area: " + villa.getUsedArea() + SEPERATOR + "Rate: " + villa.getRate() + SEPERATOR + "Standard Quantity: " + villa.getStandardQuantity() + SEPERATOR + "Rental Type: " + villa.getRentalType() + SEPERATOR + "Room Standard: " + villa.getRoomStandard() + SEPERATOR + "Pool Area: " + villa.getPoolArea() + SEPERATOR + "Floor Number: " + villa.getFloorNumber());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("house.csv")) {
                List<House> list = FacilityServiceImpl.getHouses();
                //String serviceName, double usedArea, double rate, int standardQuantity, String rentalType, String roomStandard, int floorNumber
                for (House house : list) {
                    bufferedWriter.write("Service Name: " + house.getServiceName() + SEPERATOR + "Used Area: " + house.getUsedArea() + SEPERATOR + "Rate: " + house.getRate() + SEPERATOR + "Standard Quantity: " + house.getStandardQuantity() + SEPERATOR + "Rental Type: " + house.getRentalType() + SEPERATOR + "Room Standard: " + house.getRoomStandard() + SEPERATOR + "Floor Number: " + house.getFloorNumber());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("room.csv")) {
                List<Room> list = FacilityServiceImpl.getRooms();
                //String serviceName, double usedArea, double rate, int standardQuantity, String rentalType, String complimentaryService
                for (Room room : list) {
                    bufferedWriter.write("Service Name: " + room.getServiceName() + SEPERATOR + "Used Area: " + room.getUsedArea() + SEPERATOR + "Rate: " + room.getRate() + SEPERATOR + "Standard Quantity: " + room.getStandardQuantity() + SEPERATOR + "Rental Type: " + room.getRentalType() + SEPERATOR + "Complimentary Service: " + room.getComplimentaryService());
                    bufferedWriter.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Collection readTextFile(String filepath) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            if (filepath.contains("employee.csv")) {
                List<Employee> employees = new ArrayList<>();

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(SEPERATOR);
                    //String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber, String email, String educationLevel, String position, int salary
                    String id = values[0];
                    String fullName = values[1];
                    String birthday = values[2];
                    String gender = values[3];
                    int idCardNumber = Integer.parseInt(values[4]);
                    int phoneNumber = Integer.parseInt(values[5]);
                    String email = values[6];
                    String educationLevel = values[7];
                    String position = values[8];
                    int salary = Integer.parseInt(values[9]);

                    employees.add(new Employee(id, fullName, birthday, gender, idCardNumber, phoneNumber, email, educationLevel,
                            position, salary));
                }
                return employees;

            } else if (filepath.contains("customer.csv")) {
                List<Customer> customers = new ArrayList<>();

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(SEPERATOR);
                    //String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber,
                    // String email, String type, String address
                    String id = values[0];
                    String fullName = values[1];
                    String birthday = values[2];
                    String gender = values[3];
                    int idCardNumber = Integer.parseInt(values[4]);
                    int phoneNumber = Integer.parseInt(values[5]);
                    String email = values[6];
                    String type = values[7];
                    String address = values[8];

                    customers.add(new Customer(id, fullName, birthday, gender, idCardNumber, phoneNumber, email, type,
                            address));
                }
                return customers;

            }
//            else if (filepath.contains("contract.csv")) {
//                Set<Contract> contracts = new LinkedHashSet<>();
//
//                String line = null;
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] values = line.split(SEPERATOR);
//                    //String contractNumber, Booking booking, int deposit, int totalBookingValue
//                    String contractNumber = values[0];
//                    String booking = values[1];
//                    int deposit = Integer.parseInt(values[2]);
//                    int totalBookingValue = Integer.parseInt(values[3]);
//
//                    contracts.add(new Contract(contractNumber, booking, deposit, totalBookingValue));
//                }
//                return contracts;
//
//            } else if (filepath.contains("booking.csv")) {
//                Set<Booking> bookings = new TreeSet<>();
//
//                String line = null;
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] values = line.split(SEPERATOR);
//                    ////String bookingCode, String checkIn, String checkOut, Customer customer, Facility service
//                    String bookingCode = values[0];
//                    String checkIn = values[1];
//                    String checkOut = values[2];
//                    String customer = values[3];
//                    String service = values[4];
//
//                    bookings.add(new Booking(bookingCode, checkIn, checkOut, customer, service));
//                }
//                return bookings;
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //RETURN STRING method();
    public static void readTextFileString(String filepath) {
        BufferedReader bufferedReader = null;
        String[] values;
        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                values = line.split(SEPERATOR);
                for (String value : values) {
                    System.out.print(value + ", ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //BYTE STREAM
    public static void writeBinaryFile(String filepath, Collection object) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(filepath));
            stream.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Collection readBinaryFile(String filepath) {
        ObjectInputStream stream = null;
        Collection obj = null;
        try {
            stream = new ObjectInputStream(new FileInputStream(filepath));
            obj = (Collection) stream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return obj;
    }
}
