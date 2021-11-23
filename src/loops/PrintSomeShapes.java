package loops;

public class PrintSomeShapes {

    public static void main(String[] args) {

        /**
            #
              #
               #
                #
                 #
                  #
                   #
         */
        int row=7;

        for (int i=1 ; i<=row ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        System.out.println("--------------------------------------");

        /**
             *
             **
             ***
             ****
             *****
             ******
         */


        int num=6;

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
