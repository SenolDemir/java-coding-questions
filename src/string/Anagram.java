package string;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {

    /*
        Write a  function that check
        if a string is build out of the same letters as another string.
        Ex: same("abc", "cab"); -> true ,
        same("abc", "abb"); -> false:
     */

    public static void main(String[] args) {

        //solution 1
        System.out.println(isAnagram("abc", "cab"));

        //solution 2
        System.out.println(same("abc", "cab"));

    }

    public static boolean isAnagram(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = a.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", b1 = "";

        for (char each: ch1 ) {
            a1+= each;
        }
        for (char each: ch2 ) {
            b1+= each;
        }
        return a1.equals(b1);

    }

    // solution 2
    public static boolean same(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
}
