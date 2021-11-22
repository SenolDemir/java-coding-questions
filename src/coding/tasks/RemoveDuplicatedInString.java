package coding.tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatedInString {

    public static void main(String[] args) {

        /**
        2. Write a return method that can remove the duplicated values
        from String
        Ex: removeDup("AAABBBCCC") ==> ABC
         */

        String ex = "AAABBBCCC";
        String result ="";

        String abcd = new StringBuffer(ex).reverse().toString();
        System.out.println("abcd = " + abcd);

        for (int i=0; i<ex.length(); i++){
            if (!result.contains("" + ex.charAt(i))) {
                result += ex.charAt(i);
            }
        }

        System.out.println(result);

        //Solution 2
        removeDuplicated(ex);

    }

    public static String removeDuplicated(String s){
        s = new LinkedHashSet<String>(Arrays.asList(s.split(""))).toString();
        s = s.replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        System.out.println(s);
        return s;
    }




}
