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

        int[] arr = {2,4,6,9,15, 23, 45, 67, 57};
        System.out.println(closestInArray(arr, 62));

        closestToGiven(arr, 62);

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


    //2 To cover more than 1 result
    public static void closestToGiven(int[] arr, int key) {

        int n = arr.length;
        int[] a1 = new int[n];
        int minDiff = Math.abs(arr[0]-key);

        for (int i = 0; i < n; i++) {
            a1[i] = Math.abs( arr[i]-key);
            if(a1[i] < minDiff) {
                minDiff = a1[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a1[i] != minDiff) {
                continue;
            }else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
