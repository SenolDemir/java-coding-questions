package methods;

public class LicenceAge {

    public static void main(String[] args) {

        /*
        5. Write a Java metod to find someone is old enough to get driver licence according to given birth year
	    Doğum yılına göre yaşın ehliyet almaya yeterli olup olmadığını gösteren bir metod yazın
         */

        age(2008);

    }

    public static void age(int birthYear){

        int currentYear = 2021;
        if((currentYear-birthYear)>18){
            System.out.println("You can get driver licence");
        }else {
            System.out.println("You can get driver licence " + (18-(currentYear-birthYear)) + " years later");
        }
    }
}
