package maps;

import java.util.HashMap;
import java.util.Map;

public class FirsChar {

    /**
         * (from Codinbat map-2)
        Given an array of non-empty strings, return a Map<String, String>
        with a key for every different first character seen,
        with the value of all the strings starting
        with that character appended together in the order they appear in the array.
     */

    public static void main(String[] args) {

        String [] words = {"salt", "tea", "soda", "toast"};
        System.out.println(firstChar(words));

    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.computeIfPresent(""+s.charAt(0), (k, v) -> v + s);
            map.putIfAbsent("" + s.charAt(0), s);

        }
        return map;
    }
}
