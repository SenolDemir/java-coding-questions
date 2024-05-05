package control.statements;

public class EvenOrOddNumber {

    /**
        Interview Question / Java Coding Tasks 13.
        Write a program which can identifies given number is even or odd
     */


    public static void main(String[] args) {

        int num = 77;

        if(num%2==0){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }
    }



}
