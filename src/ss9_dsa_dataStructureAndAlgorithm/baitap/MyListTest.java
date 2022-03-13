package ss9_dsa_dataStructureAndAlgorithm.baitap;

import ss6_Inheritance.Thuchanh.Shape;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Shape> check = new MyList<>(5);
        check.add(2,new Shape("C",true));
        check.add(1,new Shape("A",true));
        check.add(0,new Shape("B",true));
        check.add(1,new Shape("D",true));
        check.add(5,new Shape("E",true));
        check.add(0,new Shape("F",true));
        //check.remove(0);
        //check.clear();
        boolean contain = check.contains(new Shape("C",true));
        System.out.println("contain ? " + contain);
        int index = check.indexOf(new Shape("B",true));
        System.out.println("index = " + index);
        for(int i = 0;i<check.getLength();i++) {
            System.out.println(check.get(i));
        }

    }
}