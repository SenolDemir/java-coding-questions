package arrays;

public class MinimumInArray {

    /*
        Write a method that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int[] arr = {2,3,7,10,23,13};

        System.out.println(minOfArray(arr));

    }

    public static int minOfArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int each:arr) {
            if(each<min)
                min=each;
        }
        return min;
    }
}
