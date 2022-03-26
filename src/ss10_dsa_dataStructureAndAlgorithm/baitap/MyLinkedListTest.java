package ss10_dsa_dataStructureAndAlgorithm.baitap;

public class MyLinkedListTest {
    public static void main(String[] args) {
    MyLinkedList<String> check = new MyLinkedList<String>();
    check.addFirst("A");
    check.add(0,"B");
    check.add(2,"C");
    check.add(3,"H");
    check.add(3,"Hadd");
    check.addLast("D");
    check.addLast("F");
    check.addLast("G");
    check.remove(0);
    check.remove("A");

    System.out.println("First element: " + check.getFirst());
    System.out.println("Last element: " + check.getLast());
    System.out.println("contain ? " + check.contains("C"));
    System.out.println("contain ? " + check.contains("M"));
    System.out.println("index: " + check.indexOf("Hadd"));

    System.out.println("CloneList: ");
    check.clone().printList();
    System.out.println("\n----------");
//    check.clear();
    check.printList();


    }
}
