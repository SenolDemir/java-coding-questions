package practice;

public class Closest {

    /*
     Input: (1,3,5,9,11), 6
        Output: 5
        Input: (1,3,5,9,11), 10
        Output: 9 , 11
     */

    public static void main(String[] args) {
        int[] arr = {1,3, 5, 9, 11,55, 78, 81};

       System.out.println(closest(arr, 80));


    }

    public static int closest(int[] arr, int key){

        int temp = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]-key)<temp){
                result = arr[i];
                temp = Math.abs(arr[i]-key);
            }
        }
        return result;
    }
}
