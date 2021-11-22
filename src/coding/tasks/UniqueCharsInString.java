package coding.tasks;

import java.util.Arrays;
import java.util.Collections;

public class UniqueCharsInString {

    /**
        3. Write a return method that can find the unique characters from the
        String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        //Solution 1
        System.out.println(unique(str));

        //Solution 2
        System.out.println(uniqueChars(str));


    }

    public static String unique(String s){
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


    public static String uniqueChars(String str) {
        String result ="";
        for(String each : str.split(""))
            result += ( (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        return result;
    }
}
