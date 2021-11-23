package loops;

public class PrintDecreasingNumbers {

    public static void main(String[] args) {

        for (int i=4 ; i>=1 ; i--) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(j);
                //if (j==1) {}
            }
            System.out.println();
        }
        /*
        output

        1234
        123
        12

         */
    }
}
