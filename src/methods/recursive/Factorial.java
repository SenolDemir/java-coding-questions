package methods.recursive;

public class Factorial {

    // Write a Java recursive method to calculate the factorial of a given positive integer.


    public static void main(String[] args) {

        System.out.println(factorial(9));

    }

    public static int factorial(int n){
        if(n==0)return 1; // Base case: factorial of 0 is 1
        return n * factorial(n-1);

    }
}
