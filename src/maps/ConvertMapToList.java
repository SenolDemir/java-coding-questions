package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertMapToList {

    /**
    You are given a Map exists of keys and values.
    Create 3 different ArrayList with key set, value set, and key-value set of given Map.

     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(22, "A");
        map.put(55, "B");
        map.put(33, "Z");
        map.put(44, "M");
        map.put(99, "I");
        map.put(88, "X");

        // key list
        List keyList = new ArrayList(map.keySet());
        System.out.println(keyList);
        // value list
        List valueList = new ArrayList(map.values());
        System.out.println(valueList);
        // key-value list
        List entryList = new ArrayList(map.entrySet());
        System.out.println(entryList);


    }
}
