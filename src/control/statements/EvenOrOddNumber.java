package control.statements;

public class EvenOrOddNumber {

    /**
        Interview Question / Java Coding Tasks 13.
        Write a program which can identifies given number is even or odd
     */

    public static void main(String[] args) {

        int num = 12;

        if (num%2==0){
            System.out.println(num + " is a even number");
        }else {
            System.out.println(num + " is a odd number");
        }
    }
}
