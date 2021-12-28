package arrays;

public class ClosestToGiven {

    /**
        Interview Coding 29
        Given sorted array, print the number that’s closest to the key
        Ex:
        Input: (1,3,5,9,11), 6
        Output: 5
        Input: (1,3,5,9,11), 10
        Output: 9 , 11
     */

    public static void main(String[] args) {

        int[] arr = {2,4,6,9,15, 23, 45, 67};
        System.out.println(closestInArray(arr, 62));

    }

    public static int closestInArray(int[] arr, int key){
        int result=0;
        int diff = Math.abs(arr[0]-key);
        for (int i=0; i<arr.length; i++){
            if(Math.abs(arr[i]-key)<diff){
                diff = Math.abs(arr[i]-key);
                result = arr[i];
            }
        }
        return result;
    }
}
