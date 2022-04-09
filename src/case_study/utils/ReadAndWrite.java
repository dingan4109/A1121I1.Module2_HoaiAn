package case_study.utils;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.BookingServiceImpl;
import case_study.services.ContractServiceImpl;
import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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
                    bufferedWriter.write(employee.getId() + SEPERATOR + employee.getFullName() + SEPERATOR + employee.getBirthday() + SEPERATOR + employee.getGender() + SEPERATOR + employee.getIdCardNumber() + SEPERATOR + employee.getPhoneNumber() + SEPERATOR + employee.getEmail() + SEPERATOR + employee.getEducationLevel() + SEPERATOR + employee.getPosition() + SEPERATOR + employee.getSalary());
                    bufferedWriter.newLine();
                }
            } else if (filepath.contains("customer.csv")) {
                List<Customer> list = CustomerServiceImpl.getCustomerList();

                //String id, String fullName, String birthday, String gender, int idCardNumber, int phoneNumber,
                // String email, String type, String address
                for (Customer customer : list) {
                    bufferedWriter.write(customer.getId() + SEPERATOR + customer.getFullName() + SEPERATOR + customer.getBirthday() + SEPERATOR + customer.getGender() + SEPERATOR + customer.getIdCardNumber() + SEPERATOR + customer.getPhoneNumber() + SEPERATOR + customer.getEmail() + SEPERATOR + customer.getType() + SEPERATOR + customer.getAddress());
                    bufferedWriter.newLine();
                }
            }else if (filepath.contains("contract.csv")) {
                Set<Contract> list = ContractServiceImpl.getContractList();

                //String contractNumber, Booking booking, int deposit, int totalBookingValue
                for (Contract contract : list) {
                    bufferedWriter.write(contract.getContractNumber() + SEPERATOR + contract.getBookingCode() + SEPERATOR + contract.getDeposit() + SEPERATOR + contract.getTotalBookingValue());
                    bufferedWriter.newLine();
                }
            }else if (filepath.contains("booking.csv")) {
                Set<Booking> list = BookingServiceImpl.getBookingList();

                //String bookingCode, String checkIn, String checkOut, Customer customer, Facility service
                for (Booking booking : list) {
                    bufferedWriter.write(booking.getBookingCode() + SEPERATOR + booking.getCheckIn() + SEPERATOR + booking.getCheckOut() + SEPERATOR + booking.getCustomer() + SEPERATOR + booking.getService());
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

    public static List<Employee> readTextFile(String filepath) {
        BufferedReader bufferedReader = null;
        List<Employee> employees = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(SEPERATOR);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    //BYTE STREAM
    public static void writeFile(String filepath, Collection object) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(filepath, true));
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

    public static Object readFile(String filepath) {
        ObjectInputStream stream = null;
        Object obj = null;
        try {
            stream = new ObjectInputStream(new FileInputStream(filepath));
            obj = stream.readObject();
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
