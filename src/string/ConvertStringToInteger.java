package string;

import java.util.InputMismatchException;

public class ConvertStringToInteger {

    /**
        Cybertek java Interview Coding Tasks 37
        Write a program that can convert a string to integer.
        DO NOT use parse or valueOf methods
     */

    public static void main(String[] args) {

        int converted = convertToInteger("2344");
        System.out.println("converted = " + converted);


    }

    public static int convertToInteger(String str){
        int result = 0;
        int factorTo10 = 1;
        try {
            for (int i = str.length() - 1; str.startsWith("-") ? i > 0 : i >= 0 ; i--) {
                char each = str.charAt(i);
                result += (each - '0') * factorTo10;
                factorTo10 *= 10;
            }
        }catch(InputMismatchException e){
            return 0;
        }
        return result;
    }
}
