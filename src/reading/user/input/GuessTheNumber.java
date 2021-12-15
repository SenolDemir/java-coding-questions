package reading.user.input;

import java.util.Scanner;

public class GuessTheNumber {

    /**
     1-30 arası bir sayı girin ve onu programda saklayın, bu karşıdaki kişinin bulması gereken GIZLI sayı.
     Ask to user to iput a number.
     "Lutfen sayı tahmin ediniz"8
     8 Çok küçük
     "Lutfen sayı tahmin ediniz"25
     25 Çok büyük
     "Lutfen sayı tahmin ediniz"17
     17 Çok küçük
     "Lutfen sayı tahmin ediniz"21
     BILDINIZ !! TEBRIKLER

     EK
     Sson satırı şuşekilde bitirin
     TEBRIKLER ! 4. Denemede Bildiniz

     */

    public static void main(String[] args) {

        int secretnumber=9;
        int inputnumber;
        int attempt = 0;
        boolean flag = false;

        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number between 1-30 :");
            inputnumber = keyboard.nextInt();
            attempt++;
            if(inputnumber<secretnumber){
                System.out.println(inputnumber + " is too large, please try again!");
            }else if(inputnumber>secretnumber){
                System.out.println(inputnumber + " is too small, please try again!");
            }else {
                System.out.println("Bravo!!, You got the number in  " + attempt + " attempt");
            }
        }while(inputnumber!=secretnumber);

    }
}
