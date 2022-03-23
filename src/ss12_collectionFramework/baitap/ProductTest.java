package ss12_collectionFramework.baitap;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager productList = new ProductManager();

        int choose = 6;
        do{
            System.out.println("1. Add new");
            System.out.println("2.Edit");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Choose options");
            Scanner input = new Scanner(System.in);
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    productList.add();
                    break;
                case 2:
                    productList.edit();
                    break;
                case 3:
                    productList.delete();
                    break;
                case 4:
                    productList.search();
                    break;
                case 5:
                    productList.display();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Not a function");
            }
        }while(choose != 6);

    }
}
