package ss10_stack_queue.thuchanh;

import ss9_dsa_dataStructureAndAlgorithm.baitap.MyLinkedList;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        LinkedList<Integer> linkedLists = new LinkedList<>();
        linkedLists.add(10);
        linkedLists.add(22);
        linkedLists.add(333);
        linkedLists.addFirst(66);

        linkedLists.remove();
        linkedLists.remove();

        for (int i = 0; i < linkedLists.size(); i++) {
            System.out.println(linkedLists.get(i)
            );
        }


        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);

        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.print("Dequeued item is " + queue.dequeue().key);

        System.out.println();
        queue.printList();


    }
}
