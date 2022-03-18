package ss10_stack_queue.thuchanh;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node newNode = new Node(key);
        if(tail == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    //Return deleted Node
    public Node dequeue() {
        if(head == null) {
            throw new NullPointerException();
        }
        Node deletedNode = head;
        head = head.next;
        size --;
        //Continue checking if head now point to nothing (in case the original LinkedList has only 1 element)
        if(head == null) {
            tail = null;
        }
        return deletedNode;
    }

    public void printList() {
        for(int i = 0; i<size;i++) {
            System.out.print(head.key + "\t");
            head = head.next;
        }
    }
}
