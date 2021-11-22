package coding.tasks;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharsInStringInSorted {

    /**
    Java Coding Task 44. ( Using Treemap )
    Return the frequency of each character in the given string in Sorted manner
    Ex:
    Input: DDDAACCCCCCB
    Output: A2B1C6D3
     */

    public static void main(String[] args) {

        String str = "DDDAACCCCCCB";

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        str = "";
        for(Map.Entry<String, Integer> each: map.entrySet()){
            str += each.getKey()+each.getValue();
        }

        System.out.println(str);

    }
}
