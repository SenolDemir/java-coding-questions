package string;

import java.util.Scanner;

public class LaptopConfiguration {

    /**
        (From Replit 57 -> Scanner Class + String + If Else )
        Write a program that will calculate laptop price based on the components.
		First ask user for a screen size.
		If screen size is equals to 13.3, add  $200 to the laptop price.
		If screen size is equals to  15.0 - add  $300 to the laptop price.
		If screen size is equals to  17.3 - add  $400 to the laptop price.
		Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
		If CPU type equals to i5, add  $250 to the laptop price.
		If CPU type equals to i7, add  $350 to the laptop price.
		Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price.
		Then, ask user for storage type. There are 2 options: SSD and HDD.
		If it's HDD - add $50 to the laptop price for every 500gb.
		If it's SSD - add $100 to the laptop price for every 500GB.
		Then ask user for for screen resolution.
		There are 2 options: FULLHD and 4K.
		Add $100 if it's FULLHD screen and $200 if it's 4K screen.

		Example:

		Display message: Select screen size:
		input: 13.3
		Display message: Select CPU type:
		input: i7
		Display message: Select RAM size:
		input: 8
		Display message: Select storage type:
		input: SSD
		Display message: Enter memory size:
		input: 1000
		Display message: Enter screen resolution:
		input: 4K
		Display message: Laptop price is: $1050.0
		Example #2

		Display message: Select screen size:
		input: 13.3
		Display message: Select CPU type:
		input: i3
		Display message: Select RAM size:
		input: 4
		Display message: Select storage type:
		input: HDD
		Display message: Enter memory size:
		input: 500
		Display message: Enter screen resolution:
		input: FULLHD
		Display message: Laptop price is: $550.0"

     */
    public static void main(String[] args) {

		double price = 0;
		String storageType, screenType, cpu, resolution;
		int ram = 0 ;
		int memory = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println ("Select screen size:");
		screenType=scan.nextLine();
		if (screenType.equals("13.3")){
			price=price+200;
		}else if (screenType.equals("15.0")){
			price=price+300;
		}else if (screenType.equals("17.3")){
			price=price+400;
		}
		System.out.println ("Select CPU type:");
		cpu=scan.nextLine();
		if (cpu.equals("i3")){
			price=price+150;
		}else if (cpu.equals("i5")){
			price=price+250;
		}else if (cpu.equals("i7")){
			price=price+350;
		}
		System.out.println ("Select RAM size:");
		ram=scan.nextInt();
		if (ram==4){
			price=price+50;
		}else if (ram==8){
			price=price+100;
		}else if (ram==12){
			price=price+150;
		}else if (ram==16){
			price=price+200;
		}
		System.out.println ("Select storage type:");
		storageType=scan.next();

		System.out.println ("Enter memory size:");
		memory=scan.nextInt();

		if (storageType.equals("HDD")){
			price=price+ 50*(memory/500);

		}else if (storageType.equals("SSD")) {
			price=price+100*(memory/500);
		}

		System.out.println ("Enter screen resolution:");
		resolution=scan.next();

		if (resolution.equals("FULLHD")) {
			price=price+100;
		}else if (resolution.equals("4K")) {
			price=price+200;
		}

		System.out.println("Laptop price is: $" + price );



	}
}
