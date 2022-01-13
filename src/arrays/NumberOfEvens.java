package arrays;

public class NumberOfEvens {

    /*
    Write a method that accepts an array and prints the number of even numbers in the
    array.
    int[] x = {2,1,2,3,4} = > 3
    int[] y = {2,2,0} = > 3
    int[] z = {1,3,5} = > 0
     */

    public static void main(String[] args) {

        int[] x = {2, 5, 8, 9, 11, 23, 6, 20};
        evenNumbers(x);

    }

    public static void evenNumbers(int[] arr) {
        int counter = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
