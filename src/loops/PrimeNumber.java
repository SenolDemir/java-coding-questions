package loops;

public class PrimeNumber {

    /**
    Java Coding Task 48.
    Write a method that can check if a number is prime or not

     Asal sayilar

     */

    public boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}
