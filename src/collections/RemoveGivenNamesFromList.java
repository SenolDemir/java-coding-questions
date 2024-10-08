package collections;

import java.util.*;

public class RemoveGivenNamesFromList {

    /**
     * Interview Coding Questions 18
     * Given a list of people' names like "Ahmed", "John", Eric",
     * Write a java program to remove all the names according to the given
     */

    public static void main(String[] args) {

        //Solution 1
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        //Solution 2:
        List<String> namesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        for (ListIterator<String> it = namesList.listIterator(); it.hasNext(); )
            if (it.next().equals("Ahmed"))
                it.remove();
        System.out.println(namesList);

        //Solution 3:
        List<String> names2 = new ArrayList<>();
        namesList.forEach(p -> {
            if (p.equals("Ahmed")) names2.add(p);
        });
        System.out.println(names2);

        //Solution 4:
        Iterator<String> it = namesList.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println(namesList);
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[j] == strings[i]) {
                    count++;
                }
            }
            if (count >= 2) {
                map.put(strings[i], true);
            }else {map.put(strings[i], false);}
        }
        return map;
    }

}
