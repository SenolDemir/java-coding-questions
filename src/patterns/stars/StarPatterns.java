package patterns.stars;

public class StarPatterns {


    public static void main(String[] args) {


        //Right Triangle Star Pattern

        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("------- Left Triangle Star Pattern ---------");

        // Left Triangle Star Pattern

        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int l = 1; l <= n - i; l++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        System.out.println("------ Downward Triangle Star Pattern ------------");
        /*
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= 0 + i; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }


        System.out.println("------Pyramid Star Pattern ---------- ");

        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        int m = 5;
        for (int i = 0; i <= m; i++) {
            System.out.print(" ");
            for (int j = 0; j < m - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("------ Reversed Pyramid Star Pattern --------");

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i <= m; i++) {
            System.out.print(" ");
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < m - i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }


        System.out.println("---- Right Pascal’s Triangle ------- ");

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i <= n; i++) {

            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("-----Left  Triangle Pascal’s ------------");

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("    ");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }


        System.out.println("---Sandglass Star Pattern----------");


        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         *
         * *
         * * *
         * * * *
         * * * * *

         */

        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <rows; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }


    }
}
