package string;

public class FirstUniqueChar {

      /**
        Interview Coding Questions 38
        Write a program that can return the first non-repeated character from a string
     */

    public static void main(String[] args) {

        String str = "pprrsttt";
        System.out.println(firstUniqueChar(str));


    }

    public static char firstUniqueChar(String str) {


        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                return str.charAt(i);
            }
        }
        return ' ';

    }


}
