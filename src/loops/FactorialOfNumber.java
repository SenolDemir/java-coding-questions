package loops;

public class FactorialOfNumber {

    /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {

        System.out.println(factorialNumber(10));

    }


    public static int factorialNumber(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }


}
