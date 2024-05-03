package operators;

public class SumOfDigits {

    /*

    Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
    Test Data
    Input an integer between 0 and 1000: 565
    Expected Output :
    The sum of all digits in 565 is 16
     */

    public static void main(String[] args) {

        int num = 567;
        int firstDigit = num%10;
        int secondDigit = (num%100 - firstDigit)/10;
        int thirdDigit = (num%1000 - (num%100 - firstDigit))/100;
        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of all digits of " + num + " is: " + sum);



    }
}
