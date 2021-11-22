package coding.tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FrequencyOfCharInString {

    /**
    5. Write a return method that can find the frequency of
    characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String str ="AAABBCCDDDDDEE";

        //Solution 1
        String nonDup = "";
        String result = "";

        for (int i=0; i<str.length(); i++){
            if(!nonDup.contains(""+ str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        for (int i=0; i<nonDup.length(); i++){
            int count = 0;
            for (int j=0; j<str.length(); j++){
                if(str.charAt(j)==nonDup.charAt(i)){
                    count++;
                }
            }
            result += "" + nonDup.charAt(i) + count;
        }
        System.out.println(result);

        //Solution 2
        System.out.println(frequencyOfChars(str));

        //Solution 3
        System.out.println(FrequencyOfChars(str));


    }

    public static String frequencyOfChars(String str) {
        String expectedResult = "";
        int j=0;
        while( j < str.length()) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult +=str.charAt(j)+"" + count;
            str = str.replace(""+str.charAt(j) , "" );
        }
        return expectedResult;
    }

    public static String FrequencyOfChars(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ","").replace("[","").replace("]","");
        String result="";
        for(int j=0; j<b.length();j++) {
            int count=0;
            for(int i=0; i<str.length(); i++)
                if(str.substring(i, i+1).equals(""+b.charAt(j)))
                    count++;
            result+=b.substring(j, j+1)+count;
        }
        return result;
    }
}
