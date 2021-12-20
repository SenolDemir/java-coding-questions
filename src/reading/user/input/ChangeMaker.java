package reading.user.input;

import java.util.Scanner;

public class ChangeMaker {

    /**
    Ask user to input a number from 1 to 99.
    Write a method to find the combination of coins
    that equals to amount of change in quarter, dimes nickels and pennies.
        quarter -> 25
        dimes -> 10
        nickels -> 5
        pennies -> 1
    As the result display like this:
        99 cents can given as:
        3 quarter
        2 dimes
        0 nickels
        1 pennies
     */

    public static void main(String[] args) {


        changeMaker ();

    }

    public static void changeMaker(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number from 1-99 :");
        int amount = keyboard.nextInt();

        if(amount<0 || amount>99){
            System.out.println("This amount is out of range!");
        }else {
            int originalAmount=amount;
            int quarter=amount/25;
            amount=amount%25;
            int dimes=amount/10;
            amount=amount%10;
            int nickles=amount/5;
            amount=amount%5;
            int pennies=amount;

            System.out.println(originalAmount + " cent in coins is can be given as:");
            System.out.println(quarter + " quarters");
            System.out.println(dimes + " dimes");
            System.out.println(nickles + " nickles");
            System.out.println(pennies + " penies");
        }
    }




}
