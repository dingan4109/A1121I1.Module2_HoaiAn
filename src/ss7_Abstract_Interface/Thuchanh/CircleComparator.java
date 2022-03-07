package ss7_Abstract_Interface.Thuchanh;

import ss6_Inheritance.Thuchanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        //1st compare radius
        if(o1.getRadius() > o2.getRadius()) return 1;
        else if(o1.getRadius() < o2.getRadius()) return -1;
        else {
            //2nd compare color - String type using compareTo
            if((o1.getColor()).compareTo(o2.getColor()) > 0) return 1;
            else if((o1.getColor()).compareTo(o2.getColor()) < 0) return -1;
            else return 0;
        }
    }
}
