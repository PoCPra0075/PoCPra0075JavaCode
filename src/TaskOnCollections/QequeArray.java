package TaskOnCollections;

import java.util.*;

public class QequeArray {

    public static void main(String[] args) {

        Queue<Integer> arrayqueue = new ArrayDeque<>();
        // Add Element
        arrayqueue.add(10);
        arrayqueue.add(9);
        arrayqueue.add(8);
        arrayqueue.add(7);
        arrayqueue.add(6);
        arrayqueue.add(5);

        System.out.println(arrayqueue);

        System.out.println(arrayqueue.size());

        System.out.println(arrayqueue.remove(5));
        System.out.println(arrayqueue);

        System.out.println(arrayqueue.contains(5));

        System.out.println(arrayqueue.size());
        arrayqueue.element();
        System.out.println(arrayqueue);

    }
}

