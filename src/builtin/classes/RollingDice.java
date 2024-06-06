package builtin.classes;

import java.util.Random;

public class RollingDice {

    /*
    Write a program that will roll 2 dices up to 5 times.
    If total of numbers match 8 print "You win"
    If 5 times rolling happened stop the program
     */

    public static void main(String[] args) {

        rollingDice();

    }

    public static void rollingDice(){

        Random rn = new Random();
        int count = 0;
        int toplam = 0;

        do {
            int zar1 = rn.nextInt(6)+1;
            int zar2 = rn.nextInt(6)+1;
            toplam = zar1+zar2;
            count++;

            System.out.println(count + " denemeniz zarların toplamı "  + toplam);

            if(toplam == 8){
                System.out.println("Başardınız");
                break;
            }else if(count==5){
                System.out.println("Deneme hakkınız bitti");
                System.out.println("Başarısız oldunuz");
                break;
            }else {
                System.out.println("Başarısız oldunuz");
            }
        }while(toplam!=8);

    }



}
