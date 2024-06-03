package patterns.numerics;

public class NumericDiomand {


    public static void main(String[] args) {

        /*

           1
          212
         32123
        4321234
         32123
          212
           1
         */

        int row = 4;

        int space = row;


        for (int i = 0; i <= row ; i++) {
            for (int j = 1; j<=space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int k = i; k>=1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <=i ; k++) {
                System.out.print(k);
            }
            System.out.println();

        }
        space = 1;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            for (int k = row-i; k >=1 ; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <=row-space; k++) {
                System.out.print(k);
            }

            System.out.println();
            space++;

        }


        
        
        

    }


}
