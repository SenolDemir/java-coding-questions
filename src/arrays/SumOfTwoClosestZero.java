package arrays;

import java.util.Arrays;

public class SumOfTwoClosestZero {

    /**
        Interview Coding 33
        Return the sum of the two elements closest to zero
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative on
     */

    public static void main(String[] args) {

        int[] arr = {3,6,-2,-5,7,9};

        System.out.println(sumOfTwoClosestZero(arr));


    }

    public static int sumOfTwoClosestZero(int[] a){

        int b[]=new int[2];
        int z=0;
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++){
                int sum=a[i]+a[j];
                if(z==0)
                    z=sum;
                if(Math.abs(sum)>0 && Math.abs(sum)<Math.abs(z)){
                    z=sum;
                    b[0]=a[i];
                    b[1]=a[j];
                }
            }
        return z;

    }
}
