package TaskOnCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        // Add Element
        set.add(10);
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);
        set.add(5);

        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.remove(5));
        System.out.println(set);

        System.out.println(set.contains(5));

        System.out.println(set.size());
    }
}
