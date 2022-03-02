package ss6_Inheritance.Baitap;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D a = new Point3D();
        System.out.println(a);

        Point3D b = new Point3D(3,4,5);
        System.out.println(Arrays.toString(b.getXYZ()));
        b.setXYZ(1,2,3);
        System.out.println(Arrays.toString(b.getXYZ()));
    }
}
