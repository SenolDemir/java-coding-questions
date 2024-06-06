package methods;

import java.util.Random;
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


        guessGame();


    }

    public static void guessGame(){
        Random rn = new Random();
        int secretNumber = rn.nextInt(30)+1;
        int inputNumber;
        int attempt=0;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.print("Enter a number between 1-30 :");

            inputNumber = keyboard.nextInt();
            attempt++;

            if(inputNumber<0 || inputNumber>30){
                System.out.println(inputNumber + " is out of range");
            }else if(inputNumber>secretNumber){
                System.out.println(inputNumber + " is too large, please try again!");
            }else if(inputNumber<secretNumber){
                System.out.println(inputNumber + " is too small, please try again!");
            }else {
                System.out.println("Bravo!!, You got the number in  " + attempt + " attempt");
            }
        }while(inputNumber!=secretNumber);

    }


}
