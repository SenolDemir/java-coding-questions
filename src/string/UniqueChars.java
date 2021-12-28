package string;

import java.util.Arrays;
import java.util.Collections;

public class UniqueChars {

    /**
        Interview Coding Task 3
        Write a return method that can find the unique characters from the
        String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        //Solution 1
        //with charAt()
        System.out.println(uniqueChar(str));

        //Solution 2
        //With array
        System.out.println(uniqueCharsWithCollection(str));

        //Solution 3
        //Eith Collection
        System.out.println(uniqueChars(str));


    }

    public static String uniqueChar(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++) {
                if (str.charAt(j)==str.charAt(i)) {
                    count++;
                }
            }
            if(count==1){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String uniqueChars(String s){
        String[] arr = s.split("");
        String unique="";

        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j].equals(arr[i]))
                    count++;
            }
            if(count==1)
                unique+=arr[i];
        }
        return unique;
    }


    public static String uniqueCharsWithCollection(String str) {
        String result ="";
        for(String each : str.split(""))
            result += ( (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        return result;
    }
}
