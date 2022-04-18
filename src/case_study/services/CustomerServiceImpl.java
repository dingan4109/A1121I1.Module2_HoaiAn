package case_study.services;

import case_study.Test;
import case_study.models.Customer;
import case_study.utils.ReadAndWrite;
import case_study.utils.Regex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner input = new Scanner(System.in);
    static List<Customer> customerList = null;

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

    public void loadDataFromFile() {
        List<String[]> listToRead = Test.read("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\customer" +
                ".csv");
        customerList = new ArrayList<>();
        for(String[] line : listToRead) {
            String id = line[0];
            String fullName = line[1];
            String birthday = line[2];
            String gender = line[3];
            int idCardNumber = Integer.parseInt(line[4]);
            int phoneNumber = Integer.parseInt(line[5]);
            String email = line[6];
            String type = line[7];
            String address = line[8];

            Customer customer = new Customer(id,fullName,birthday,gender,idCardNumber,phoneNumber,email,type,address);
            customerList.add(customer);
        }
    }

    public void saveDataToFile() {
        List<String[]> listToWrite = new ArrayList<>();
        for(Customer customer : customerList) {
            listToWrite.add(customer.toStringArray());
        }

        Test.write("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\case_study\\data\\customer" +
                ".csv",listToWrite);
    }

    @Override
    public void displayList() {
        loadDataFromFile();

        if(customerList.isEmpty()) {
            System.out.println("No data");
        }else {
            for(Customer customer : customerList) {
                System.out.println(customer.toString());
            }
        }

    }


    @Override
    public void addNew() {
        loadDataFromFile();
        Customer customer = getCustomer();
        customerList.add(customer);

        saveDataToFile();
    }


    @Override
    public void edit() {
        loadDataFromFile();
        System.out.println("Input customer id to edit");
        String checkId = input.nextLine();

        boolean isFound = false;
        for(int i = 0; i < customerList.size();i++) {
            if(customerList.get(i).getId().equals(checkId)) {
                isFound = true;
                System.out.println("Input update data");
                Customer customer = getCustomer();
                customerList.set(i,customer);
                break;
            }
        }

        if(!isFound) {
            System.out.println("Customer is not found");
        }

        saveDataToFile();

    }

    public void delete() {
        loadDataFromFile();
        System.out.println("Input customer id to delete");
        String checkId = input.nextLine();

        boolean isFound = false;
        for(int i = 0;i<customerList.size();i++) {
            if(customerList.get(i).getId().equals(checkId)) {
                isFound = true;
                customerList.remove(i);
                System.out.println("Delete successfully");
                break;
            }
        }
        if(!isFound) {
            System.out.println("Customer is not found");
        }

        saveDataToFile();
    }
}
