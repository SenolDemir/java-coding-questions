package operators.user.input;

import java.util.Scanner;

public class CalculateEnergy {

    /**
        1 su kazaninda M agirligna ve iTemp sicakliginda su vardir.
        Bu suyun sicakligini fTemp derecesine cikarmak icin ne kadarli bir enerjiye ihtiyac var?
        Q = M * (finalTemperature – initialTemperature) * 4184
        Q : bulmamiz gerekn enerji miktari,
        M : suyun kutlesi,
        fTemp : hedeflenen sicaklik
        iTemp : baslangis sicakligi
     */

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight of water you make make hot:");
        double mass = in.nextDouble();
        System.out.print("Enter the initial tempurature of water: ");
        double iTemp = in.nextDouble();
        System.out.print("Enter the final tempurature for the water: ");
        double fTemp = in.nextDouble();

        double Q = mass * (fTemp-iTemp) * 4184;
        System.out.println("You need "+ Q + " energy to make the water hot.");




    }








}
