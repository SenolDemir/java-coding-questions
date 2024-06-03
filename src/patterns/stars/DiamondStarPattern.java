package patterns.stars;

public class DiamondStarPattern {


    /**
          *
         ***
        *****
       *******
      *********
       *******
        *****
         ***
          *
     */

    public static void main(String[] args) {

        diamondPattern(5);


    }

    public static void diamondPattern(int row){

        int space = 1;
        int i, j;

        space = row-1;

        for (i = 1; i <= row; i++) {
            for (j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            space--;
            for (j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (i=1; i<=row; i++){
            for (j=1; j<=space; j++){
                System.out.print(" ");
            }
            space++;
            for(j=1; j<= 2*(row-i)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
