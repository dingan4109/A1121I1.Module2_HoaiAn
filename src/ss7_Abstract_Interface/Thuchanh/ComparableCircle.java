package ss7_Abstract_Interface.Thuchanh;

import ss6_Inheritance.Thuchanh.Circle;

import java.util.Comparator;

public class ComparableCircle extends Circle  implements Comparable<ComparableCircle>{
    public ComparableCircle() {}
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()) return 1;
        else if(getRadius() < o.getRadius()) return -1;
        else return 0;

        //(getRadius() > o.getRadius()) ? 1: (getRadius() < o.getRadius()) ? -1:0;
    }
}
