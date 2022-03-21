package ss9_dsa_dataStructureAndAlgorithm.thuchanh;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        System.out.println(ll.getNumNodes());
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        ll.addFirst(15);

        ll.add(4,9);
        ll.add(4,99);
        ll.get(8);
        System.out.println(ll.getNumNodes());
           ll.printList();


    }
}
