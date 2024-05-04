package operators.user.input;

import java.util.Scanner;

public class TwoIntegers {

    /*

    Write a Java program that accepts two integers from the user and prints the sum,
    the difference, the product, the average,

        Test Data
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.00

     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = in.nextInt();

        System.out.println("Sum of two integer is: "+ (num1+num2));
        System.out.println("Difference of two integer is: "+ (num1-num2));
        System.out.println("Product of two integer is: "+ (num1*num2));
        System.out.println("Product of two integer is: "+ ((num1+num2)/2));








    }
}
