package reading.user.input;

import java.util.Scanner;

public class AreaOfCircle {

    /**
    Ask user to input radius of circle
    Use this value as a radius of circle and display the area of circle.
	Note: Use Math Class for PI
	A = PI * r * r

     */

    public static void main(String[] args) {

        areaOfCircle();

    }

    public static void areaOfCircle(){

        System.out.print("Enter the radius of cycle : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.println();
        System.out.println("The area of cycle is :" + area + " and the radius of it is: " + r);


    }
}
