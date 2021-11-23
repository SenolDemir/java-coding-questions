package loops;

public class ArmstrongNumber {


    /***
        Create a method that will accept a number and check if the number is an Armstrong number.
        If the number is an Armstrong number return true otherwise return false.

        Tüm basamaklarındaki rakamların sayı değerlerinin küpleri toplamı,
        kendisine eşit olan sayılara "Armstrong sayı"denir.

        Örneğin; 371=33+73+13=27+343+1=371
     */

    public static void main(String[] args) {

        // For Loop
        System.out.println(isArmstrongNum(50));

        // While Loop
        System.out.println(isArmstrongNumber(70));

    }

    public static boolean isArmstrongNum( int num) {
        String number = String. valueOf (num);
        int multiplier=number.length();
        int sum= 0 ;
        for ( int i = 0 ; i < multiplier; i++) {
            int digit = Integer. parseInt ( "" +number.charAt(i));
            sum+=Math. pow (digit,multiplier);
        }
        return sum==num;
    }

    public static boolean isArmstrongNumber(int num){
        int a = 0, b =0, c= num;
        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        return c==b;
    }


}

