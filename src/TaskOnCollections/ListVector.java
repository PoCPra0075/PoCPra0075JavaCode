package TaskOnCollections;

import java.util.Vector;

public class ListVector {
    public static void main(String[] args) {

        // List - Interface
        // VectorList - Class

        Vector<String> list = new Vector<String>();
        // Add Element
        list.add("I");
        list.add("an");
        list.add("Qa");
        list.add("Engineer");
        list.add("in");
        list.add("Capital");

        System.out.println(list);

        System.out.println(list.get(4));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(3));

        System.out.println(list.contains("in"));

        System.out.println(list.size());
        System.out.println(list.lastIndexOf("Qa"));
    }
}
