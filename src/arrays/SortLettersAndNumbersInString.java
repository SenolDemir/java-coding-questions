package arrays;

import java.util.Arrays;

public class SortLettersAndNumbersInString {

    /*
    Given alphanumeric String,sort the string in its numeric and letters parts and display
    sorted alphanumeric string.
    We need to split the string into substrings of consecutive letters or numbers, sort the  individual
    string and append them back together.
    Ex:
    Input: "DC501GCCCA098911"
    Output: "CD015ACCCG011899"

     */

    public static void main(String[] args) {

        String str = "DC501GCCCA098911";

        System.out.println(str);
        System.out.println(sortLettersAndNumbersInString(str));

    }

    public static String sortLettersAndNumbersInString(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
        }

        String[] arr = temp.split(",");
        str ="";
        for(String each: arr) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar: chars){
                str +=""+eachChar;
            }
        }
        return str;

    }



}
