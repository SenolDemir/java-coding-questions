package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfParameters {

    /**
        Interview Coding Questions 31
        Write a metot which returns a Set equal to the intersection of the parameter of 2 Sets
        The method should not chage the content of the parameters.
     */

    public static void main(String[] args) {

        Set<Object> a = new HashSet<>(Arrays.asList(2,7,12,78));
        Set<Object> b = new HashSet<>(Arrays.asList(2,6,13,78,90));

        Set<Object> c = getIntersection(a,b);
        System.out.println(c);


    }

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {

        if(a.size() > b.size()){
            a.retainAll(b);
            return a;
        }else{
            b.retainAll(a);
            return b;
        }
    }
}
