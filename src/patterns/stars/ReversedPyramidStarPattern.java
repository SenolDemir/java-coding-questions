package patterns.stars;

public class ReversedPyramidStarPattern {

    public static void main(String[] args) {


        reversedPyramidStars(5);
    }



    public static void reversedPyramidStars(int rows){

        for (int i= 0; i<= rows-1 ; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
