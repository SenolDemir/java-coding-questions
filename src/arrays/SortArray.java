package arrays;

import java.util.Arrays;

public class SortArray {

    /*
        Write a return method that can sort an int array in Ascending order
         without using the sort method of the Arrays class
     */

    public static void main(String[] args) {

        int [] arr = {2,7,1,78,23,45};

        sortArray(arr);

    }

    public static  void sortArray(int[] arr){


        for ( int i=0; i < arr.length; i++) {
            for ( int j=0 ; j < arr.length; j++) {
                int temp= 0 ;
                if (arr[i] < arr[j]){ // if I change ‘<’ to ‘>’ it will sort from bigger to smaller
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp; } } }
        System. out .println(Arrays.toString (arr));

        }



}
