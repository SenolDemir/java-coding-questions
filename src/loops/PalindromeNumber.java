package loops;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        //1 - while loop
        int number = 12321;
        int r;
        int sum = 0;
        int originNum = number;

       while (number!=0){
           r = number%10;
           sum = (sum*10) + r;
           number = number/10;

       }
        if(originNum==sum){
            System.out.println(originNum + " is a palindrome number");
        }else {
            System.out.println(originNum + " is not a palindrome number");
        }


        System.out.println("----------------------------------------------");

       // 2 - with for loop
        int n = 12321;
        int remainer;
        int result = 0;
        originNum = n;

       for( ;n!= 0; n /= 10) {
            remainer = n % 10;
            result = result * 10 + remainer;
        }

        if(originNum==result){
            System.out.println(originNum + " is a palindrome number");
        }else {
            System.out.println(originNum + " is not a palindrome number");
        }


        //3 - as a method with user input
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