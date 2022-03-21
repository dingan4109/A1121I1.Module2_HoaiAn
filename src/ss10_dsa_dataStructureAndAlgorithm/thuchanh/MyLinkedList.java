package ss9_dsa_dataStructureAndAlgorithm.thuchanh;

public class MyLinkedList {

    private Node head;
    private int numNodes; //size init = 0

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
        //numNodes++;
    }

    public void add(int index, Object data) {
        if(index < 1) {
            addFirst(data);
        } else  if (index >= numNodes) {
            Node currentNode = head;
            Node newNode = new Node(data);
            for(int i = 0; i < numNodes; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = null;
            currentNode.next = newNode;

            numNodes++;
        }else {
            Node preNode = null; //= holder
            Node currentNode = head;
            Node newNode = new Node(data);
            for(int i = 0; i <= index;i++) {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            preNode.next = newNode;

            numNodes++;
        }
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        numNodes++;
    }

    public Node get(int index) {
        Node current = head;
        for(int i = 0; i<index;i++) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        for(int i = 0; i<=numNodes;i++) {
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }

    public int getNumNodes() {
        return numNodes;
    }
}
