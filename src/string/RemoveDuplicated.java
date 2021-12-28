package string;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicated {

    /**
        2. Write a return method that can remove the duplicated values from String
        Ex: removeDup("AAABBBCCC") ==> ABC
    */

    public static void main(String[] args) {


        //1 for loop
        System.out.println(removeDuplicated("AABBCDDDE"));

        //2 Collection
        System.out.println(removeDuplicatedWithCollection("AABBCDDDE"));


    }

    public static String removeDuplicated (String str){
        String result= "";
        for (int i = 0; i <str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result+= "" + str.charAt(i);
            }
        }

        return result;
    }


    public static String removeDuplicatedWithCollection(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","")
                .replace("[","")
                .replace("]","")
                .replace(" ", "");
        return str;
    }





}
