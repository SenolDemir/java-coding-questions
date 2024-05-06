package methods;

import java.util.Scanner;

public class CheckNumber {

    /**
        Create a method called sign.
        Ask user to input  a number and tells you if it is positive, negative or zero.
        for example :
        sign(5) => positive
        sign(-30)=> negative
        sign(0) => 0
        the parameter should be entered by user (create a scanner object)
     */

    public static void main(String[] args) {

        sign();

    }

    public static void sign(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if(a<0) System.out.println("negative");
        else if(a==0) System.out.println(0);
        else System.out.println("positive");
    }


}
