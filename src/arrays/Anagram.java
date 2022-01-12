package arrays;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.BiPredicate;

public class Anagram {

    /**
     Anagram (Same Letters)
     Interview Coding Task 1
     Write a return method that check if a string is build out of the same
     letters as another string.
     Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
     */


    public static void main(String[] args) {

        //Solution 1 (Arrays)
        System.out.println(sameLetters("abcd", "dcab"));

        //Solution 2  (Collection)
        System.out.println(sortedSameLetters("abcd", "dcab"));


        System.out.println("--------------------------------------------------");

        //4: With Functional Interface
        BiPredicate<String, String> sameLetters = (a,b) -> {
            char [] ch1 = a.toCharArray();
            char [] ch2 = b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        };

        System.out.println(sameLetters.test("financial", "cialfinan"));



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
