package collections;

import java.util.*;

public class SortHashMapByKey {

    /**
    You are given a HashMap exists of Integer keys and String values.
    Write a program to sort HashMap by keys.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");

        Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);
        System.out.println("After Sorting:");

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print(pair.getKey() + ": ");
            System.out.println(pair.getValue());
        }


    }
}
