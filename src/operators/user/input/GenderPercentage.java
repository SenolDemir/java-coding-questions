package operators.user.input;

import java.util.Scanner;

public class GenderPercentage {

    /**
        Ask user how many male are there in the class and save it.
        Ask again to user how many female are there in the class and save it.
        Then display the percentage of male and female in class according to given number
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How many female are there in the class: ");
        int females = in.nextInt();
        System.out.print("How many male are there in the class: ");
        int males = in.nextInt();

        int total = males+females;
        int femalePer = (females*100)/total;
        int malePer = (males*100)/100;
        System.out.println("Females are the %"+femalePer + " of the class.");
        System.out.println("Males are the %"+malePer + " of the class.");

    }



}
