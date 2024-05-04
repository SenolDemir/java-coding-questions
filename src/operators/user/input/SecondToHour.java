package operators.user.input;

import java.util.Scanner;

public class SecondToHour {

    /**
        Write a program that outputs the number of hours, minutes, and seconds that  corresponds to input total seconds.
        Ask user to enter seconds:
        Enter seconds:"
        Convert them into minutes, hours and dsiplay the result:

        Example run:
        Enter seconds:
        3695
        Output: 1 hours, 1 minutes, and 35 seconds
     */


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalSeconds = in.nextInt();

        int seconds = totalSeconds%60;
        int totalMinutes = totalSeconds /60;
        int minutes = totalMinutes%60;
        int hours = totalMinutes/60;

        System.out.println("Output: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");


    }



}
