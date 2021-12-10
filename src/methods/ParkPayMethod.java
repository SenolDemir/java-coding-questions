package methods;

public class ParkPayMethod {

      /**
        Write a Java program to give total pay of park according to given hour rate.
        But there must be discount of %20 if the time is after 20 to 8 am
        //	Verilen saat ücretine ve saat sayısına göre toplam park ucretini hesaplayan bir metod yazın
        */

    public static void main(String[] args) {


            parkPay(4, 4.5);


    }

    public static void parkPay(double hour, double hourlyPay) {
        double totalPay =  hour * hourlyPay;
        System.out.println("Total Park Pay is " + totalPay + " Euros");
    }


}
