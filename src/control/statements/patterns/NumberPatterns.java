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
                //if (j==1) {}
            }
            System.out.println();
        }








    }
}
