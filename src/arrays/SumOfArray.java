package arrays;

public class SumOfArray {

    /*
    Write a method that accepts an array of int and
    returns the sum of all elements in the array
     */

    public static void main(String[] args) {

        int[] a = {3,-2,10,4};

        System.out.println(sumOfArray(a));
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int each:arr) {
            sum+=each;
        }
        return sum;
    }
}
