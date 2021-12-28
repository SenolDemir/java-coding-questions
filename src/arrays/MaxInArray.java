package arrays;

public class MaxInArray {

    /*
        Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

        int[] arr = {2,3,7,10,23,13};

        System.out.println(maxOfArray(arr));

    }

    public static int maxOfArray(int[] arr){
        int max = 0;

        for (int each:arr) {
            if(each>max)max=each;
        }
        return max;
    }
}
