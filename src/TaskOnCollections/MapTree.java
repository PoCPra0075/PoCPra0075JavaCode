package TaskOnCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTree {

    public static void main(String[] args) {

        Map<Integer,String> hashmaps = new TreeMap<>();
        // Add Element
        hashmaps.put(10,"Ten");
        hashmaps.put(9,"nine");
        hashmaps.put(8, "eight");
        hashmaps.put(5, "five");


        System.out.println(hashmaps);

        System.out.println(hashmaps.size());

        // peek means return the value

        System.out.println(hashmaps.get(9));
        // add the value in the list
        hashmaps.remove(5);
        System.out.println(hashmaps);
    }
}

