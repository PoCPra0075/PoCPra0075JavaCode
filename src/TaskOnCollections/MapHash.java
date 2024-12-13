package TaskOnCollections;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {

        Map<Integer,String> hashmaps = new HashMap<>();
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


