package reading.user.input;

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

        secondToHour();

    }

    public static void secondToHour(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds:");
        int totalSeconds = sc.nextInt();

        int seconds = totalSeconds%60;
        int minutes = totalSeconds/60;
        int hours = minutes/60;
        minutes = minutes%60;

        System.out.println(totalSeconds+" seconds is :");
        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");
    }


}
