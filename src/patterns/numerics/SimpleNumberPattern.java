package patterns.numerics;

public class SimpleNumberPattern {


    public static void main(String[] args) {

        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */
        int num = 1;
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }

        System.out.println("----- Decreasing numbers ---------");
         /*
            output
            1234
            123
            12
            1
         */

        for (int i=9 ; i>=1 ; i--) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }








    }
}
