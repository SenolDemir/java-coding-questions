package control.statements;

import java.util.Scanner;

public class CarModels {

    /**
    Task: Write a program that lets user to enter Mercedes, Volvo, Opel, Sahin Car Models
    If it is Mercedes display "Good one" If it is Volvo display "Tough one"
    If it is Opel display "Not bad" If it is Sahin display "Not recommended"
    Else "Do not buy that one!"

    Görev: Kullanıcının Mercedes, Volvo, Opel, Şahin Araba Modellerini girmesini sağlayan bir program yazın
    Mercedes ise "İyi olan" göster Volvo ise "Zor olan" göster
    Opel ise "Fena değil" göster Şahin ise "Tavsiye edilmez" göster
     Aksi takdirde "Bunu satın almayın!"
     */

    public static void main(String[] args) {


        String model = "Honda";

        switch(model){
            case "Mercedes":
                System.out.println("Good one");
                break;
            case "Volvo":
                System.out.println("Tough one");
                break;
            case "Opel":
                System.out.println("Not bad");
                break;
            case "Sahin":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy this one");


        }
    }
}
