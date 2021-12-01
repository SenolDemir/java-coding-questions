package methods;

public class Love6 {

    /*

    The number 6 is a truly great number.
    Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6.

     */

    public static void main(String[] args) {

        love6(12,6);

    }

    public static void love6 (int num1, int num2) {

        if (num1==6 || num2==6) {
            System.out.println(true);
        }else if (num1+num2==6 || num1-num2==6 || num2-num1==6) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
