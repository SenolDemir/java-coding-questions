package loops;

public class PrimeNumber {

    /**
    Java Coding Task 48.
    Write a method that can check if a number is prime or not

    Asal sayilar
     */

    public static void main(String[] args) {

        int n = 1;
        boolean isPrime = true;

        if(n<2){
            isPrime = false;
        }else{
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }

        System.out.println("-------------------------------------");

        System.out.println(isPrimeNumber(183));
    }


    public static boolean isPrimeNumber(int num) {
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

    //3
    public static void isPrime(int num){

        int count = 0;
        if(num<2){
            System.out.println(num + " is not a prime number");
        }
        for(int i = 2; i<num; i++){
            if(num%i==0) count++;
            break;
        }
        if(count==0){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }



}
