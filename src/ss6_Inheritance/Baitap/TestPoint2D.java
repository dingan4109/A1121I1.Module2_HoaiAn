package ss6_Inheritance.Baitap;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        System.out.println(a);

        Point2D b = new Point2D(2,4);
        System.out.println(b);
        System.out.println(Arrays.toString(b.getXY()));
        System.out.println(b.toString());
    }
}
