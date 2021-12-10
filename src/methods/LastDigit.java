package methods;

public class LastDigit {

    /**
        Write a java program to check the last digit of two given number is same or not?
     */

    public static void main(String[] args) {

        lastDigit(123 ,223);

    }

    public static void lastDigit(int num1, int num2){

        if(num1%10==num2%10){
            System.out.println("They have same last digit");
        }else{
            System.out.println("They do not have same last digit");
        }
    }
}
