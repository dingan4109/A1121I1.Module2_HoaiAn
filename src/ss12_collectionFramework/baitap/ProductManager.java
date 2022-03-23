package ss12_collectionFramework.baitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager<E> implements Comparator<Product>{
    static Scanner input = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public Product getProduct() {
        System.out.println("Input product id");
        String id = input.nextLine();
        System.out.println("Input product name");
        String name = input.nextLine();
        System.out.println("Input product price");
        int price = Integer.parseInt(input.nextLine());

        return new Product(id, name, price);
    }

    public void add() {
        Product product = getProduct();
        productList.add(product);
        System.out.println("Successfully added new product");
    }

    public void edit() {
        int i = getIndex();
        if (i != -1) {
            System.out.println("Start input new information");
            productList.set(i, getProduct());
            System.out.println("Edited successfully");
        } else {
            System.out.println("Product is not found");
        }
    }

    public void delete() {
        int i = getIndex();
        if (i != -1) {
            productList.remove(i);
        } else {
            System.out.println("Product is not found");
        }
    }

    public void search() {
        int i = getIndex();
        if(i != -1) {
            System.out.println(productList.get(i).toString());
        } else {
            System.out.println("Product is not found");
        }
    }

    public int getIndex() {
        System.out.println("Input product id");
        String id = input.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().contains(id)) {
                return i;
            }
        } return -1;
    }

        public void display() {
            for(Product product : productList) {
                System.out.println(product.toString());
            }
        }

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()>o2.getPrice()) return 1;
        else if(o1.getPrice()<o2.getPrice()) return -1;
        else return 0;
    }
}

