package reading.user.input;

import java.util.Scanner;

public class FindUser {

        /**
        Write a program that will look up for user.
        Assume that you have only 2 users: Alan Smith and John Wane.
        First, ask user to enter full name. Display message: ""Enter full name:"".
        Then take input from user.
        If name is equals to either "Alan Smith" or "John Wane",  display message: "User found!".
        Otherwise,  display message: "User not found!".
        Example:
        Display message: Enter full name:
        input: John Wane
        Display message: User found!"
     */

        public static void main(String[] args) {

            findUser();

        }

        public static void findUser(){

            String user1 = "Alan Smith";
            String user2 = "John Wane";

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter full name :");
            String input = sc.nextLine();

            if(input.equals(user1) || input.equals(user2)){
                System.out.println("User Found");
            }else {
                System.out.println("User Not Found!");
            }

        }
}
