package patterns.stars;

public class LeftTriangleStarPattern {

    public static void main(String[] args) {


        leftTrianglePattern(5);

    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */

    public static void leftTrianglePattern(int n){

        for (int i = 0; i < n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
