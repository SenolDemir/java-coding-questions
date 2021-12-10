package patterns.stars;

public class PyramidStarPattern {




    public static void main(String[] args) {


        pyramidPattern(5);

        pyramidPatterWithSpace(5);



    }

    /**

         *
        ***
       *****
      *******
     *********

     */

    public static void pyramidPattern(int n){

        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

        /**

             *
            * *
           * * *
          * * * *
         * * * * *


         */

        public static void pyramidPatterWithSpace(int n){

            for(int i=1; i<=n; i++){
                for(int k=1; k<=n-i; k++){
                    System.out.print(" ");
                }
                for (int j=1; j<=i;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
}




