package loops;

public class SumOfDigits {


    /**
    Java Coding Task 52.
    Write a function that can return the sum of digits of an integer
    Do not use any string manipulations
    Ex: input: 123
    output: 6

     */

    public static void main(String[] args) {

        int number = 157;
        System.out.print("sum of digits in "+ number);
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        System.out.println(" is " + sum);

    }
}
