package TaskOnCollections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {

        Queue<Integer> linkedQueue = new LinkedList<>();
        // Add Element
        linkedQueue.add(10);
        linkedQueue.add(9);
        linkedQueue.add(8);
        linkedQueue.add(7);
        linkedQueue.add(6);
        linkedQueue.add(5);

        System.out.println(linkedQueue);

        System.out.println(linkedQueue.size());

        System.out.println(linkedQueue.remove(5));
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.contains(5));

        System.out.println(linkedQueue.size());
        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue);

        // peek means return the value

        System.out.println(linkedQueue.peek());
        // add the value in the list
        linkedQueue.poll();
        System.out.println(linkedQueue);

    }
}
