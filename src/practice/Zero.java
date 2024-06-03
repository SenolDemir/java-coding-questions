package practice;

import java.util.Arrays;

public class Zero {


    public static void main(String[] args) {

        int[] arr = {1,4,8,0,13,0,56};
        zeroToEnd(arr);
    }


    public static void zeroToEnd (int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[i]+1;
                arr[arr.length-1] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
