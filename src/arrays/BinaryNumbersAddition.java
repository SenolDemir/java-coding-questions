package arrays;

import java.util.Arrays;

public class BinaryNumbersAddition {


    /*
        Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output

        Sum of two binary numbers: 101
     */

    public static void main(String[] args) {

        sumOfBinary(100010, 110010 );


    }


    public static void sumOfBinary(long binary1, long binary2){
        int i = 0, remainder = 0;
        int [] sum = new int[20];

        while (binary1 != 0 && binary2 != 0){
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder)%2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
            }
        if(remainder!=0){
            sum[i++] = remainder;

        }
        i--;

        while (i>=0){
            System.out.print(sum[i--]);

        }

    }
}
