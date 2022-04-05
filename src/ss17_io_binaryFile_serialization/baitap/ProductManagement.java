package ss17_io_binaryFile_serialization.baitap;

import ss17_io_binaryFile_serialization.thuchanh.MainStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner input = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void addProduct() {
        System.out.println("Input code");
        int code = Integer.parseInt(input.nextLine());
        System.out.println("Input name");
        String name = input.nextLine();
        System.out.println("Input company");
        String company = input.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Input description");
        String description = input.nextLine();

        Product product = new Product(code,name,company,price,description);
        productList.add(product);
    }

    public static void displayProduct(List<Product> products) {
        for(Product product : products) {
            System.out.println(product.toString());
        }
    }

    public static void writeProductToFile(String path,List<Product> productList) {
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(productList);

            System.out.println("Done");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readProduct(String path) {
        ObjectInputStream ois = null;
        List<Product> products = null;

        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) ois.readObject();


        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        displayProduct(products);
    }

    public static void main(String[] args) {
//        MainStudent mainStudent = new MainStudent();
        int choose = 2;
        do{
            System.out.println("1. Add product");
            System.out.println("2. Show and Exit");

            System.out.println("Input choose");
            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                   addProduct();
                   break;
                case 2:
                    writeProductToFile("MainStudent.txt",productList);
                    readProduct("MainStudent.txt");
                    System.exit(2);
                default:
                    System.out.println("Input choose again");
            }
        }while(choose != 2);

    }
}
