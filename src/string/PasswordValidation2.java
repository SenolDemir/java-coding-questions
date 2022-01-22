package string;

import java.util.Scanner;

public class PasswordValidation2 {

    /*
        Write a program that wants user to input a password. Then check password as if it has conditions;
        First character of password must be upper case
        Last character of password must be lower case
        It has no space
        It has minimum 8 characters or more
        If it has all those condition then print:
           "Password created succesfully"
        If no:
           "Password can not created succesfully. Please enter a new password"
        ( Kullanicidan bir sifre girmesini isteyin Asagidaki sartlari sagliyorsa “Sifre
        basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali)
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = scanner.next();
        if (isValid(password)) {
            System.out.println("Password created succesfully");
        } else {
            System.out.println("Password can not created succesfully. Please enter a new password");

        }
    }

    public static boolean isValid(String password) {
        char first = password.charAt(0);
        char last = password.charAt(password.length() - 1);
        boolean flag = false;
        if (password.length() >= 8 && !(password.contains(" "))) {
            if ((first >= 'A' && first <= 'Z') && (last >= 'a' && last <= 'z')) {
                flag = true;
            }
        }
        return flag;
    }


}
