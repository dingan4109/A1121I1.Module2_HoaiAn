package ss9_dsa_dataStructureAndAlgorithm.thuchanh;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(3);

        System.out.println(Arrays.toString(listInteger.getElements()));
        System.out.println(listInteger.getElement());
//        listInteger.ensureCapa();
//        System.out.println(listInteger.getElement());
        System.out.println(Arrays.toString(listInteger.getElements()));
        System.out.println(listInteger.get(6));

    }
}
