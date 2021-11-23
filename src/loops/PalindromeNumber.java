package loops;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        isPalindrome(num);

    }

    public static void isPalindrome(int num){
        int x=num;
        int r;
        int sum=0;
        boolean result;

        while (num>0) {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
            System.out.println(num);

        }if (sum==x) {
            result=true;
        }else {
            result=false;
        }

        System.out.println(result);




    }
}