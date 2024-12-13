package TaskOnCollections;

import java.util.*;

public class SetHash {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // Add Element
        set.add("I");
        set.add("an");
        set.add("Qa");
        set.add("Engineer");
        set.add("in");
        set.add("Capital");

        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.remove("in"));
        System.out.println(set);

        System.out.println(set.contains("in"));

        System.out.println(set.size());
    }
}