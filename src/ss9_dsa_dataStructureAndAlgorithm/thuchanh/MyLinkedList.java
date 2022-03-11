package ss9_dsa_dataStructureAndAlgorithm.thuchanh;

public class MyLinkedList {

    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }


    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    

}
