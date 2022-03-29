package ss15_exception_debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super();
    }
    public IllegalTriangleException(String mess) {
        super(mess);
    }

    public static void checkIllegalTriangle(int x, int y, int z) throws IllegalTriangleException{
        int xy = x + y;
        int xz = x + z;
        int yz = y + z;

        if(xy <= z || xz <= y || yz <= x || x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("Illegal triangle side");
        }else {
            System.out.println("Legal triangle");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = input.nextInt();
        System.out.print("Input y: ");
        int y = input.nextInt();
        System.out.print("Input z: ");
        int z = input.nextInt();

        try {
            checkIllegalTriangle(x,y,z);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }


}
