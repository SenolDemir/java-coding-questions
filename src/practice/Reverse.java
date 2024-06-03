package practice;

import java.util.Arrays;

public class Reverse {


    public static void main(String[] args) {

        int [] arr = {2,5,15,3,11,4};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        int n = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result[n++] = arr[i];
        }


        return result;
    }
}
