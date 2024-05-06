package control.statements;

public class PositiveNegativeOrZero {

    /**
        In this assignment you are given an int num.
		you need to check if num is positive negative or equals to zero.
		use 3 if statements to do this .
		output if num is positive negative or zero
		for example:
		num  = 1
		print:
		""positive""
		num = -6
		print:
		""negative""
		num = 0
		print:
		""zero""
     */


    public static void main(String[] args) {

        int num = -9;

        if(num<0) System.out.println(num + " is negative number");
        else if (num==0) System.out.println(num + " is zero");
        else System.out.println(num + " is positive number");



    }
}
