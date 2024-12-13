package TaskOnCollections;

import java.util.Stack;

public class ListStack {

    public static void main(String[] args) {

        // List - Interface
        // VectorList - Class

        Stack<String> list = new Stack<>();
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
        // peek means return the value
        list.peek();
        System.out.println(list);
        // add the value in the list
        list.push("I");
        System.out.println(list);
        //remove the value in the list
        list.pop();
        System.out.println(list);

    }
}

