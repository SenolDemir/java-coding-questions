package string;

import java.util.Scanner;

public class UserNamePassword {

    /*
        Create a Login Functionality according to following Logic
        • UserName,Password
        • --- > Program will ask to enter username and password
        • --- > If both username and password are blank
        • "UserName and Password Fields cannot be empty”
        • --- > If userName is blank and password is not blank
        • "UserName cannot be empty”
        • --- > If userName is not blank and password is blank
        • "Password cannot be empty”
        • --- > If the username or password is not valid
        • "UserName or password is not valid. Please verify”
        • --- > If the username and password are both valid
        • “User Logged in successfully"
     */

    public static void main(String[] args) {

        checkCredentials();

    }

    public static void checkCredentials(){

        String username = "mikesmith";
        String password = "Test1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String typedUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String typedPassword = sc.nextLine();

        if(typedUsername.isEmpty() && typedPassword.isEmpty()){
            System.out.println("UserName and Password Fields cannot be empty");
        }else if(typedUsername.isEmpty()){
            System.out.println("UserName cannot be empty");
        }else if(typedPassword.isEmpty()){
            System.out.println("UserName cannot be empty");
        }else if (!typedUsername.equals(username) || !typedPassword.equals(password)){
            System.out.println("UserName or password is not valid. Please verify");
        }else if (typedUsername.equals(username) || typedPassword.equals(password)){
            System.out.println("User Logged in successfully");
        }

    }
}
