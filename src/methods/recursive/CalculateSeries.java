package methods.recursive;

public class CalculateSeries {

    // Write a Java recursive method to calculate the sum of all numbers from 1 to n.


    public static void main(String[] args) {

        System.out.println(calculateSeries(18));

    }


    public static int calculateSeries(int n){
        if (n==0){
           return 0;
        }
        return n + calculateSeries(n-1);
    }
}
