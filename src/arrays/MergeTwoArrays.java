package arrays;

import java.util.Arrays;

public class MergeTwoArrays {

     /*
        Write a return method that can concat two arrays
     */

    public static void main(String[] args) {

        int[] arr1 = {2,3,5,7,10};
        int[] arr2 = {14,20,23,50};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];
        int i= 0;
        for (int each:arr1) {
            result[i++]=each;
        }
        for (int each:arr2) {
            result[i++]=each;
        }
        return result;
    }
}
