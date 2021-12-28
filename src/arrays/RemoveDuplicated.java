package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicated {

    /**
        Interview Coding 51
        Write a function that can remove the duplicates from an array of integers
     */

    public static void main(String[] args) {


        int[] arr = {2, 4, 7, 3, 2, 1, 9, 4};

        System.out.println(Arrays.toString(removeDuplicates(arr)));

        System.out.println(Arrays.toString(removeDuplicates2(arr)));


    }
    //Solution 1
    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);
            }
        }
        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }



}
