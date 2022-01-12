package collections;

import java.util.*;

public class RemoveNumbersFromList {

    /**
        Interview Coding Questions 19
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values
        greater than 100.
     */

    public static void main(String[] args) {

        //Solution 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int each : list1)
            if( each < 100)
                list2.add(each);
        list1=list2;
        System.out.println(list1);


        //Solution 2
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            if(it.next()>100)
                it.remove();
        System.out.println(list);

        //Solution 3:
        for(ListIterator<Integer> il = list.listIterator(); il.hasNext();)
            if(il.next()>100)
                il.remove();
        System.out.println(list);

        //Solution 4:
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        list3.removeIf(p -> p>100);
        System.out.println(list3);
    }
}
