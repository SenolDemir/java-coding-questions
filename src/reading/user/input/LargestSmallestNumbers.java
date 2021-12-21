package reading.user.input;

import java.util.Scanner;

public class LargestSmallestNumbers {

    /**
        Write a program to get integer numbers from user and display the largest number beetween them.
        Ask to user input an integer number, ask again to input next integer number.
        Then ask user if he/she wants to input a new number.
        If yes start your program again and ask for new input,
        if no finish the program and display the largest number between given numbers
		Ex:
		Enter your first number : 10
		Enter your next number: 40
		Do you want to enter another number : 0-No ; 1-Yes
		Largest number is 40
		Smallest number is 20

        (Kullanıcıdan tamsayıları alıp aralarındaki en büyük sayıyı gösteren bir program yazınız.
        Kullanıcıdan bir tam sayı girmesini isteyin, bir tam sayı daha girmesini isteyin.
        Ardından kullanıcıya yeni bir numara girmek isteyip istemediğini sorun.
        Evet ise programınızı yeniden başlatın ve yeni girdi isteyin,
        hayır ise programı bitirin ve verilen sayılar arasındaki en büyük sayıyı görüntüleyin.)
     */

    public static void main(String[] args) {

        int largest=0;
        int smallest=0;
        int userInput;
        int choose=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number :");
        userInput=sc.nextInt();

        smallest=userInput;
        largest=userInput;

        do {
            System.out.print("Enter your next number:");
            userInput=sc.nextInt();
            if (userInput>largest) {
                largest=userInput;
            }else if (userInput<smallest) {
                smallest=userInput;
            }
            System.out.print("Do you want to enter another number : 0-No ; 1-Yes");
            choose=sc.nextInt();
            if (choose!=1) {
                break;
            }
        }while (true);

        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);

    }


}
