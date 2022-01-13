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

        // This is easy way using string
        int n = 44;
        String s = "";

        while (n>0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        System.out.println(s);

        System.out.println("-------------------------");

        //2
        int decimal = 44;

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
        System.out.println("------------------------------");

        //3. With Math.pow()

        int[] binaryArr = {0,0,0,0,0,0,0,0};

        double decimalNumber = 44;  // We need use double because of Math.pow()
        int indexNum = 0;

        for (int i = 0; i<=8 ; i++) {
            if(decimalNumber<Math.pow(2,i)) {
                indexNum = i;
                break;
            }
        }
        System.out.println("indexNum = " + indexNum);

        for(int i = index; i>=0; i--){
            if(Math.pow(2, indexNum-1)<= decimalNumber){
                binaryArr[8-i]=1;
                decimalNumber = decimalNumber - Math.pow(2, indexNum-1);
            }
            indexNum--;
        }
        System.out.println(Arrays.toString(binaryArr));



    }
}
