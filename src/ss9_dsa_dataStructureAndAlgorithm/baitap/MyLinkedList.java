package ss9_dsa_dataStructureAndAlgorithm.baitap;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(){}

    public void add(int index, E element) {
        if(index < 1) {
            addFirst(element);
        } else if(index >= numNodes) {
            addLast(element);
        } else {
            Node preNode = null;
            Node currentNode = head;
            Node newNode = new Node(element);
            for(int i = 0; i<index;i++) {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            preNode.next = newNode;

            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;

        numNodes++;
    }

    public void addLast(E e){
        Node currentNode = head;
        Node newNode = new Node(e);
        for(int i = 1; i<numNodes;i++) {
            currentNode = currentNode.next;
        }
        newNode.next = null;
        currentNode.next = newNode;

        numNodes++;
    }

    public void remove(int index) {
        if(index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        } else if(index == 0) {
            removeFirst();
        } else {
            Node preNode = null;
            Node currentNode = head;
            for(int i = 0; i<index;i++) {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            preNode.next = currentNode.next;
            numNodes--;
        }
    }

    public void removeFirst() {
        head = head.next;
        numNodes--;
    }

    public boolean remove(Object e) {
        Node currentNode = head;
        for(int i = 0; i<numNodes;i++) {
            if(currentNode.data.equals(e)) {
                remove(i);
                return true;
            }
            currentNode = currentNode.next;
        } return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        if(numNodes == 0) {
            throw new NullPointerException();
        } else {
            MyLinkedList<E> cloneList = new MyLinkedList<E>();
            Node node = head;
            cloneList.addFirst((E)node.data);
            node = node.next;
            for(int i = 1; i<numNodes;i++) {
                cloneList.addLast((E) node.data);
                node = node.next;
            }
            return cloneList;
        }

    }

    public boolean contains(E o) {
        Node currentNode = head;
        for (int i = 0; i < numNodes; i++) {
            if (currentNode.data.equals(o)) {
                return true;
            }
            currentNode = currentNode.next;
        } return false;
    }

    public int indexOf(E o) {
        Node currentNode = head;
        int index = -1;
        for (int i = 0; i <numNodes; i++) {
            if (currentNode.data.equals(o)) {
                index = i;
                return index;
            }
            currentNode = currentNode.next;
        } return index;
    }

    public E get(int index) {
        Node currentNode = head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return (E) currentNode.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        return get(numNodes-1);
    }

    //PENDING
//    public void clear() {
//        Node currentNode = head;
//        for (int i = 0; i<numNodes; i++) {
//            remove(i);
//        }
//        numNodes = 0;
//    }

    public void printList() {
            for(int i = 0; i<numNodes;i++) {
                System.out.print(head.data + "\t");
                head = head.next;
            }
    }

}
