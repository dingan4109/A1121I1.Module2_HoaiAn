package ss4_OOP.ss4_OOP_Thuchanh;

import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        //Hiển thị giá trị mặc định width = 0, height = 0;
        System.out.println(obj1.display());

        Rectangle obj2 = new Rectangle(12,7);
        double area = obj2.getArea();
        double perimeter = obj2.getPerimeter();

        System.out.printf("Rectangle's area is %.0f and perimeter is %.0f\n",area,perimeter);

        Scanner input = new Scanner(System.in);
        System.out.println("Input width");
        double width = input.nextDouble();

        System.out.println("Input height");
        double height = input.nextDouble();

        Rectangle obj3 = new Rectangle(width,height);
        System.out.println(obj3.display());
    }
}
