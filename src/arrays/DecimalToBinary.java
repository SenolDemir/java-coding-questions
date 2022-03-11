package arrays;

import java.util.Arrays;

public class DecimalToBinary {

    /**
        Java Coding Task 23.
        Convert decimal number to binary
        return the number of '1's in the binary representation of n for
        any integer n, where n > 0
        Example: for n=6 the binary representation is '110' and the
        number of '1's in that
        representation is 2

        --------------------------------------------------------

        There are numerous approaches to convert the given decimal number
        into an equivalent binary number in Java. A few of them are listed below.
         1. Using Arrays or String
         2. Using Bitwise Operators
         3. Using Math.pow() Function (Without using arrays)

     */

    public static void main(String[] args) {

        int decimal = 44;

        // This is easy way using string
        String s = "";
        while (decimal>0) {
            s = ((decimal % 2) == 0 ? "0" : "1") + s;
            decimal = decimal / 2;
        }
        System.out.println(s);

        System.out.println("-------------------------");


        //2 with array
        decimal = 780;
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;

        }

        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();

        // assigning to new array and display as array
        int[] newBinary = new int[index];

        for (int i= index-1, j=0; i>=0; i--, j++ ){
            newBinary[j] = binary[i];
        }
        System.out.println(Arrays.toString(newBinary));

        System.out.println("------------------------------");

        //Integer.toBinaryString()
        int decimalNum = 780;
        String bin = Integer.toBinaryString(decimalNum);
        System.out.println(bin);








    }
}
