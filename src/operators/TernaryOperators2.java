package operators;

import java.util.Scanner;

public class TernaryOperators2 {

    /**
     Write an expression using the conditional operator (? :)
     that compares the value of the variable x to 5 and results in:
     Display x if x is greater than or equal to 5
     Display -x if x is less than 5

     DO NOT USE IF STATEMENT or SWITCH CASE"

     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number: ");

        int x  = in.nextInt();
        int result = 0;
        result = (x>=5) ?  x: -(x);
        System.out.println("result is: " + result);




    }
}
