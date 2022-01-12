package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    /**
        Interview Coding Questions 36
        Remove palindrome strings from a List of String
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("novel", "madam", "sun", "level"));

        //Solution 1: If Lambda expression is allowed:
        System.out.println(removePalindromes(list));

        //Solution 2: (if Lambda expression is not allowed):
        System.out.println(removePalindromes2(list));


    }


    public static List<String> removePalindromes(List<String> list){
        list.removeIf( p -> isPalindrome(p) );
        return list;
    }

    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }


    public static List<String> removePalindromes2(List<String> list){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversed += word.charAt(i); }
            if(word.equalsIgnoreCase(reversed)){
                it.remove(); }
        }
        return list;
    }
}
