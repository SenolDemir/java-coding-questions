package reading.user.input;

import java.util.Scanner;

public class GenderPercentage {

    /**
        Ask user how many male are there in the class and save it.
        Ask again to user how many female are there in the class and save it.
        Then display the percentage of male and female in class according to given number
     */

    public static void main(String[] args) {

        genderPercant();

    }

    public static void genderPercant(){

        int male, female, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of female :");
        female = sc.nextInt();
        System.out.print("Enter number of male :");
        male = sc.nextInt();

        total = male + female;
        int femalePercent = (100 * female) / total;
        int malePercent = (100 * male) / total;

        System.out.println("The male percantage of class is : " + malePercent + "%");
        System.out.println("The female percantage of class is : " + femalePercent + "%");


    }

}
