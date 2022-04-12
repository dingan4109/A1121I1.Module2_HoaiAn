package case_study.services;

import case_study.models.Employee;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static List<Employee> getEmployeeList() {
        return employeeList;
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


    @Override
    public void displayList() {
//        employeeList = (List<Employee>) ReadAndWrite.readBinaryFile("E:\\A1121I1\\Module2\\A1121I1" +
//                ".Module2_HoaiAn\\src\\case_study\\data\\employee.csv");
        ReadAndWrite.readTextFileString("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\employee.csv");
    }

    @Override
    public void addNew() {
        Employee employee = getEmployee();
        employeeList.add(employee);
//        ReadAndWrite.writeBinaryFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee" +
//            ".csv",
//                employeeList);
        ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee" +
                ".csv");
    }

    @Override
    public void edit() {
        try {
            System.out.println("Input employee id to edit");
            String checkId = input.nextLine();

            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId().contains(checkId)) {
                    System.out.println("Input update information");
                    Employee employee = getEmployee();
                    employeeList.set(i, employee);
                    ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\employee" +
                            ".csv");
                } else {
                    System.out.println("Employee is not found");
                }
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
    }
}
