package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEndOfList {

    /**
        Interview Coding Questions 35
        Write a program that can move all the zeros to the end of the List of integers
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,0,8,20,3,0,9));

        System.out.println(moveZerosToTheEnd(list));


    }

    public static List<Integer> moveZerosToTheEnd(List<Integer> list){
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize-newSize;
        for(int i = 0; i < totalNumberOfZeros; i++){
            list.add(0);
        }
        return list;
    }
}
