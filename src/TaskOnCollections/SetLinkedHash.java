package TaskOnCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHash {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
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
