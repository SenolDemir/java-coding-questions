package loops;

public class DivideWithoutDivision {

    /**
        Java Coding Task 14.
        Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {

        int a = 14;
        int b = 2;

        if(b==0){
            System.out.println("Inavild Number");
        }
        System.out.print("When " + a + " divided by " + b + " is : ");
        int count = 0;

        while (a>=b){
            a-= b;
            count++;
        }
        System.out.println(count + " and, remainder is :" + a);
    }
}
