package control.statements;

import java.util.Scanner;

public class SliceNumbers {

    /**

        In this task, you need to slice an integer and print numbers one by one from new line.
		Create a scanner object
		Example # 1
		-Display prompt: Enter your number:
		12345
		-Display prompt: 1
		-Display prompt: 2
		-Display prompt: 3
		-Display prompt: 4
		-Display prompt: 5
		Example # 2
		-Display prompt: Enter your number:
		45678
		-Display prompt: 4
		-Display prompt: 5
		-Display prompt: 6
		-Display prompt: 7
		-Display prompt: 8

		Use / and % operators
     */

    public static void main(String[] args) {

        int num = 56905;
        int digit1, digit2, digit3, digit4, digit5;

        System.out.println(num / 10000);
        System.out.println(num / 1000 % 10);
        System.out.println(num / 100 % 10);
        System.out.println(num / 10 % 10);
        System.out.println(num % 10);

    }

}
