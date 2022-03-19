package case_study.services;

import case_study.models.Employee;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService{
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    public Employee getEmployee() {
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

        return new Employee(id, fullName, birthday, gender, idCardNumber, phoneNumber, email, educationLevel, position, salary);
    }


    @Override
    public void displayList() {
        for(Employee i : employeeList) {
            System.out.println(i.toString());
        }
    }

    @Override
    public void addNew() {
        Employee employee = getEmployee();
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Input employee id to edit");
        String checkId = input.nextLine();

        for(int i = 0; i<employeeList.size();i++) {
            if(employeeList.get(i).getId().contains(checkId)) {
                System.out.println("Input update information");
                Employee employee = getEmployee();
                employeeList.set(i,employee);
            }else {
                System.out.println("Employee is not found");
            }
        }
    }
}
