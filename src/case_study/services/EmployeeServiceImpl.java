package case_study.services;

import case_study.Test;
import case_study.models.Employee;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = null;
    static Scanner input = new Scanner(System.in);

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void loadDataFromFile() {
        List<String[]> data = ReadAndWrite.readDataFromFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\employee.csv");
        employeeList = new ArrayList<>();
        for (String[] entity: data) {
            String id = entity[0];
            String fullName = entity[1];
            String birthday = entity[2];
            String gender = entity[3];
            int idCardNumber = Integer.parseInt(entity[4]);
            int phoneNumber = Integer.parseInt(entity[5]);
            String email = entity[6];
            String educationLevel = entity[7];
            String position = entity[8];
            int salary = Integer.parseInt(entity[9]);
            Employee employee = new Employee(id, fullName, birthday, gender, idCardNumber, phoneNumber, email,
                    educationLevel, position, salary);
            employeeList.add(employee);
        }
    }

    public void saveDataToFile() {
        List<String[]> data = new ArrayList<>();
        for (Employee e: employeeList) {
            data.add(e.toStringArray());
        }

        ReadAndWrite.writeDataToFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee.csv", data);
    }

    public Employee getEmployee() {
        try {
            System.out.println("Input id: ");
            String id = input.nextLine();

            System.out.println("Input fullname: ");
            String fullName = input.nextLine();

            System.out.println("Input birthday: ");
            String birthday = input.nextLine();
            while(!Regex.dateValidate(birthday)) {
                System.out.println("Input again");
                birthday = input.nextLine();
            }
            Regex.birthdayCheck(birthday);

            System.out.println("Input gender: ");
            String gender = input.nextLine();

            System.out.println("Input id card number: ");
            int idCardNumber = Integer.parseInt(input.nextLine());

            System.out.println("Input phone number: ");
            int phoneNumber = Integer.parseInt(input.nextLine());

            System.out.println("Input email: ");
            String email = input.nextLine();

            System.out.println("Input education level: ");
            String educationLevel = input.nextLine();

            System.out.println("Input position: ");
            String position = input.nextLine();

            System.out.println("Input salary: ");
            int salary = Integer.parseInt(input.nextLine());

            return new Employee(id, fullName, birthday, gender, idCardNumber, phoneNumber, email, educationLevel, position, salary);
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
        return null;
    }

    public void inputEmployee(int index) {
        try {
            System.out.println("Input id: ");
            String id = input.nextLine();

            System.out.println("Input fullname: ");
            String fullName = input.nextLine();

            System.out.println("Input birthday: ");
            String birthday = input.nextLine();
            while(!Regex.dateValidate(birthday)) {
                System.out.println("Input again");
                birthday = input.nextLine();
            }
            Regex.birthdayCheck(birthday);

            System.out.println("Input gender: ");
            String gender = input.nextLine();

            System.out.println("Input id card number: ");
            int idCardNumber = Integer.parseInt(input.nextLine());

            System.out.println("Input phone number: ");
            int phoneNumber = Integer.parseInt(input.nextLine());

            System.out.println("Input email: ");
            String email = input.nextLine();

            System.out.println("Input education level: ");
            String educationLevel = input.nextLine();

            System.out.println("Input position: ");
            String position = input.nextLine();

            System.out.println("Input salary: ");
            int salary = Integer.parseInt(input.nextLine());

            Employee employee = new Employee(id, fullName, birthday, gender, idCardNumber, phoneNumber, email,
                    educationLevel, position, salary);
            if (index != -1) {
                employeeList.set(index, employee);
            } else {
                employeeList.add(employee);
            }
            saveDataToFile();
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
    }


    @Override
    public void displayList() {
        if (employeeList == null) {
            loadDataFromFile();
        }
        if (employeeList.isEmpty()) {
            System.out.println("Data of employees is empty");
            return;
        }

        for(Employee e: employeeList) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void addNew() {
//        Employee employee = getEmployee();
//        employeeList.add(employee);
////        ReadAndWrite.writeBinaryFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee" +
////            ".csv",
////                employeeList);
////        ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee" +
////                ".csv");
//        String SEPERATOR = ",";
//            String line = "ID: " + employee.getId() + SEPERATOR + "Fullname: " + employee.getFullName() + SEPERATOR +
//                    "Birthday: " + employee.getBirthday() + SEPERATOR + "Gender: " + employee.getGender() + SEPERATOR +
//                    "ID Card Number: " + employee.getIdCardNumber() + SEPERATOR + "Phone Number: " + employee.getPhoneNumber() + SEPERATOR + "Email: " +employee.getEmail() + SEPERATOR + "Education Level: " + employee.getEducationLevel() + SEPERATOR + "Position: " + employee.getPosition() + SEPERATOR + "Salary: " + employee.getSalary();
//
//            ReadAndWrite.Test("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee.csv",line);
        inputEmployee(-1);
    }

    @Override
    public void edit() {
        try {
            System.out.println("Input employee id to edit");
            String checkId = input.nextLine();
            boolean isFound = false;

            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId().equals(checkId)) {
                    isFound = true;
                    System.out.println("Input update information");
                    inputEmployee(i);
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Employee is not found");
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
    }

    //TEST
    public void testEdit(){
        List<String[]> listToRead = Test.read("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\employee.csv");
        employeeList = new ArrayList<>();

        //Convert String[] to Employee;
        for(String[] line : listToRead) {
            String id = line[0];
            String fullName = line[1];
            String birthday = line[2];
            String gender = line[3];
            int idCardNumber  = Integer.parseInt(line[4]);
            int phoneNumber = Integer.parseInt(line[5]);
            String email = line[6];
            String educationLevel = line[7];
            String position = line[8];
            int salary = Integer.parseInt(line[9]);

            Employee employee = new Employee(id,fullName,birthday,gender,idCardNumber,phoneNumber,email,
                    educationLevel,position,salary);
            employeeList.add(employee);
        }

        System.out.println("Input employee Id to edit");
        String checkId = input.nextLine();

        boolean found = false;
        for(int i = 0; i < employeeList.size();i++) {
            if(employeeList.get(i).getId().equals(checkId)) {
                found = true;
                System.out.println("Input update info");
                Employee e = getEmployee();
                employeeList.set(i,e);
                break;
            }
        }

        if(!found) {
            System.out.println("Employee is not found");
        }

        //Convert Employee to String[]
        List<String[]> listToWrite = new ArrayList<>();

        for(Employee e : employeeList) {
            String[] line = new String[10];
            line[0] = e.getId();
            line[1] = e.getFullName();
            line[2] = e.getBirthday();
            line[3] = e.getGender();
            line[4] = e.getIdCardNumber() + "";
            line[5] = e.getPhoneNumber() + "";
            line[6] = e.getEmail();
            line[7] = e.getEducationLevel();
            line[8] = e.getPosition();
            line[9] = e.getSalary()+"";

            listToWrite.add(line);
        }
        Test.write("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\employee.cvs",listToWrite);
    }


}
