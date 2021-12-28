package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

    /**
        Interview Coding 34
        Write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {

        int[] arr = {1,4,8,0,13,0,56};

        int[] arr2 = moveZerosToTheEnd(arr);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] moveZerosToTheEnd(int[] array){
        int[] result = new int[array.length];
        int count = 0;
        for (int each : array) {
            if(each != 0 )
                result[count++] = each;
        }
        return result;
    }

}
