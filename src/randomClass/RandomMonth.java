package randomClass;

import java.util.Random;

public class RandomMonth {

     /*
        Write a program to create random integer number from 1 to 12 for months
        and display the month name according to created number?
     */

    public static void main(String[] args) {

        selectMonth();

    }

    public static void selectMonth(){


        Random rn = new Random();
        int num = rn.nextInt(12)+1;

        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month number");

        }
    }
}
