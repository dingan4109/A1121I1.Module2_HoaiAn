package case_study.services;

import case_study.models.Employee;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService{
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    @Override
    public void displayListEmployee() {
      for(Employee i : employeeList) {
          System.out.println(i.toString());
      }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("Input id: ");
        String id = input.nextLine();

        System.out.println("Input fullname: ");
        String fullName = input.nextLine();

        System.out.println("Input birthday: ");
        String birthday = input.nextLine();

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

        Employee employee = new Employee(id,fullName,birthday,gender,idCardNumber,phoneNumber,email,educationLevel, position,salary);

        employeeList.add(employee);

    }

    @Override
    public void editEmployee() {
        System.out.println("Input employee id to edit");
        String id = input.nextLine();
        Employee searchEmployee = new Employee(id);
        //pending
    }

    @Override
    public void returnMainMenu() {

    }
}
