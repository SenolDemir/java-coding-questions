package loops;

public class DecimalToBinary {

    /**
    Java Coding Task 23.
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



    }
}
