package collections;

import java.util.*;

public class SortMapByValues {

    /**
        Interview Coding Questions 45
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("First", 5);
        map.put("Second", 20);
        map.put("Country", 34);
        map.put("City", 23);
        map.put("Town", 89);

        System.out.println(sortByValue(map));

        

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new
                ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}
