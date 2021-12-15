package reading.user.input;

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

        calculateEnergy();

    }

    public static void calculateEnergy (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen isitmak istediniz suyun agirligini giriniz: ");
        double suyunAgirligi = scanner.nextDouble();

        System.out.print("Suyun ilk sicakligi giriniz: ");
        double ilkSicaklik = scanner.nextDouble();

        System.out.print("Suyun hedeflenen sicaligini giriniz: ");
        double hedefSicaklik = scanner.nextDouble();

        //M * (finalTemperature – initialTemperature) * 4184
        double enerjiMiktari = suyunAgirligi * (hedefSicaklik - ilkSicaklik) * 4184;

        System.out.println("Suyu isitmak icin lazim olan enerji miktari= " + enerjiMiktari);
    }
}
