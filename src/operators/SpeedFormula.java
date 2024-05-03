package operators;

import java.util.Scanner;

public class SpeedFormula {

    /*
    Write a Java program to take the user for a distance (in meters)
    and the time taken (as three numbers: hours, minutes, seconds),
    and display the speed, in meters per second, kilometers per hour and miles per hour
   (hint: 1 mile = 1609 meters).

        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = in.nextDouble();
        System.out.print("Input hour: ");
        double hour = in.nextDouble();
        System.out.print("Input minutes: ");
        double minutes = in.nextDouble();
        System.out.print("Input seconds: ");
        double seconds = in.nextDouble();


        double totalSeconds = (hour * 60 * 60)+(minutes*60)+seconds;
        double mps = distance/totalSeconds;
        double kps = (distance/1000)/(totalSeconds/3600);
        double mph = (distance/1000 * 0.621371)/(totalSeconds/3600);

        System.out.println("Your speed in meters/second is: " + mps);
        System.out.println("Your speed in kilometers/hour is: " + kps);
        System.out.println("Your speed in miles/hour is: " + mph);







    }
}
