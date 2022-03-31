package case_study.services;

import case_study.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    public Customer getCustomer() {
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

        System.out.println("Input type: ");
        String type = input.nextLine();

        System.out.println("Input address: ");
        String address = input.nextLine();

        return new Customer(id, fullName, birthday, gender, idCardNumber, phoneNumber, email,type,address);
    }

    @Override
    public void displayList() {
        for(Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        Customer customer = getCustomer();
        customerList.add(customer);
    }


    @Override
    public void edit() {
        System.out.println("Input customer id to edit");
        String id = input.nextLine();

        for(int i = 0; i < customerList.size();i++) {
                  if(customerList.get(i).getId().equals(id)) {
                System.out.println("Start input new information");
                Customer customer = getCustomer();

                customerList.set(i, customer);
            }
        }
    }
}
