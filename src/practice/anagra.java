package practice;

import java.util.Arrays;

public class anagra {


    // Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:

    public static void main(String[] args) {


        System.out.println(same("abc", "abb"));


    }


    public static boolean same(String a, String b) {
        boolean result = false;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for (int i = 0; i < arrA.length; i++) {
            if (arrA.length == arrB.length){
                if(arrA[i] == arrB[i])
                    result = true;
            }
            else result = false;

        }

        return result;
    }


}
