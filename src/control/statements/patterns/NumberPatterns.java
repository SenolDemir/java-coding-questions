package control.statements.patterns;

public class NumberPatterns {

    public static void main(String[] args) {


        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */

        int number = 1;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(number);
                number++;
                System.out.print(" ");
            }

            System.out.println("");
        }

        System.out.println("----Pascal’s Triangle ---------");

        /*
                 1
               1   1
             1   2   1
           1   3   3   1
         1   4   6   4   1

         */



        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }







    }
}
