package methods;

public class MilesToKMMethod {

    public static void main(String[] args) {

        // Write a Java method to convert given mile to km and show the result
        //	Verilen mil i km e çeviren ve bunu gösteren metod yazın

        milesToKM(34);

    }

    public static void milesToKM(double mile){
        double km = mile*1.609344;
        System.out.println(mile + " miles is " + km + " km");
    }
}
