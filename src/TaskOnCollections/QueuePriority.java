package TaskOnCollections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>();
        // Add Element
        priorityqueue.add(10);
        priorityqueue.add(9);
        priorityqueue.add(8);
        priorityqueue.add(7);
        priorityqueue.add(6);
        priorityqueue.add(5);

        System.out.println(priorityqueue);

        System.out.println(priorityqueue.size());
        priorityqueue.element();
        System.out.println(priorityqueue);
        // peek means return the value

        System.out.println(priorityqueue.peek());
        // add the value in the list
        priorityqueue.poll();
        System.out.println(priorityqueue);

    }
}

