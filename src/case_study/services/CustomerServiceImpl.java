package case_study.services;

import case_study.models.Customer;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public Customer getCustomer() {
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

            System.out.println("Input type: ");
            String type = input.nextLine();

            System.out.println("Input address: ");
            String address = input.nextLine();

            return new Customer(id, fullName, birthday, gender, idCardNumber, phoneNumber, email, type, address);
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }
        return null;
    }

    @Override
    public void displayList() {
//        for (Customer customer : customerList) {
//            System.out.println(customer.toString());
//        }
        ReadAndWrite.readTextFileString("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\customer" +
                ".csv");
    }

    @Override
    public void addNew() {
        Customer customer = getCustomer();
        customerList.add(customer);
        ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\customer.csv");
    }


    @Override
    public void edit() {
        try {
            System.out.println("Input customer id to edit");
            String id = input.nextLine();

            for (int i = 0; i < customerList.size(); i++) {
                if (customerList.get(i).getId().equals(id)) {
                    System.out.println("Start input new information");
                    Customer customer = getCustomer();

                    customerList.set(i, customer);
                    ReadAndWrite.writeTextFile("E:\\A1121I1\\Module2\\A1121I1.Module2_HoaiAn\\src\\case_study\\data\\customer.csv");
                }
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }

    }
}
