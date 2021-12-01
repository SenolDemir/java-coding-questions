package methods;

public class ParkPayMethod {

    public static void main(String[] args) {

        //4. Write a Java program to give total pay of park according to given hour rate
        //	Verilen saat ücretine ve saat sayısına göre toplam park ucretini hesaplayan bir metod yazın

            parkPay(4, 4.5);



    }

    public static void parkPay(double hour, double hourlyPay){
        double totalPay = hour * hourlyPay;
        System.out.println("Total Park Pay is " + totalPay + "Euros");
    }


}
