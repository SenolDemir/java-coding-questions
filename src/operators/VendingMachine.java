package operators;

public class VendingMachine {

    /**
     *  (Java EU3 Assignment 3 Question 7)
		Write a program that determines the change to be dispensed from a vending machine.
		An item in the machine can cost between 25 cents and 1 //dollar, in 5-cent increments
		(25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill
		to pay for the item.
	 */

    public static void main(String[] args) {

        int price= 70;
        int balance1=100-price;
        int quarter=balance1/25;
        int balance2=balance1%25;
        int dimes=balance2/10;
        int nickles= (balance2-dimes*10)/5;

        System.out.println("The price is " + price + " cent");
        System.out.println("Your changes is total " + balance1 + " cent!");
        System.out.println("Your change is " + quarter + " quarter " + dimes + " dimes " + nickles + " nickles!");



    }
}
