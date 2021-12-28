package arrays;

import java.util.Arrays;

public class SortingArrayDescending {

    /**
        Interview Coding 49
        Write a return method that can sort an int array in Ascending order
        without using the sort method of the Arrays class
     */

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 3, 2, 1, 9};

        System.out.println(Arrays.toString(sortArrayDescending(arr)));


    }

    public static int[] sortArrayDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }



}
