package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindrome {

    /**
        Interview Coding Questions 42
        Write a program that can return the longest palindrome string from a List of String
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("novel", "madam", "sun", "elevele", "mom"));
        System.out.println(longestPalindrome(list));

    }

    public static String longestPalindrome(List<String> list){
        String longest = "";
        for (String each : list) {
            String reverse = "";
            for(int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);

            }
            if(each.equalsIgnoreCase(reverse) && each.length() >
                    longest.length()){
                longest = each;
            }
        }
        return longest;
    }


}
