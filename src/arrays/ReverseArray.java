package arrays;

import java.util.Arrays;

public class ReverseArray {

     /*
        write a function that can reverse an array
     */

    public static void main(String[] args) {

        int[] arr = {2,3,7,10,23,13};

        System.out.println(Arrays.toString(reverse(arr)));
    }


    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }

}
