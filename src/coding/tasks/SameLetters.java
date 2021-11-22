package coding.tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    /**
     1. Write a return method that check if a string is build out of the same
     letters as another string.
     Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
     */


    public static void main(String[] args) {


        //Solution 1
        System.out.println(sameLetters("abcd", "dcab"));

        //Solution 2
        System.out.println(sortedSameLetters("abcd", "dcab"));


    }

    public static boolean sameLetters(String a, String b){

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        System.out.println(aChars);
        System.out.println(bChars);
        String newA = "";
        String newB = "";

        for (char lt: aChars){
            newA += lt;
        }
        for (char lt: bChars){
            newB += lt;
        }

     return  newA.equals(newB);
    }

    public static boolean sortedSameLetters(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);



    }
}
