package TaskOnCollections;
import java.util.List;

public class ListArray {

    public static void main(String[] args) {

        // List - Interface
        // ArrayList - Class

        List<Integer> list = new java.util.ArrayList<Integer>();
        // Add Element

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);

        System.out.println(list);

        list.remove(1);
        System.out.println(list.get(3));
        list.add(4,3);
        System.out.println(list);

        list.addFirst(12);
        System.out.println(list);
        list.addLast(18);
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}