package control.statements;

public class LeapYear {


    /**
        Leap years are the ones with 366 days instead of 365.
        If year is not divisible by 4, is not leap yaer
        If year is divisible by 4 and not divisible by 100, it is divisible
        If year is divisible by 4, divisible by 100 then we have to check
        it is divisible by 400 or not. If so divisible, if not not divisible

        kural 1: 4 e tam bolunemeyen yıl artık yıl değildir.
        kural 2: 4 e bolunup 100 e bolunemeyen yıl artık yıldır.
        kural 3: 4 3 bolunup 100 e bolunenlerden 400 e tam bolunenler artık yıldır. Dıgreleri değil

     */

    public static void main(String[] args) {

        int year = 1999;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + " is a leap year");
                }else{
                    System.out.println(year + " is not a leap year");
                }
            }else{
                System.out.println(year + " is a leap year");
            }
        }else{
            System.out.println(year + " is not a leap year");
        }

        //2
        int artikYil = 1904;
        if ( (artikYil % 4 == 0) && (artikYil % 100!=0 ||  artikYil % 400==0) ) {
            System.out.println( artikYil + " yili artik yildir.");
        } else
            System.out.println(artikYil + " yili artik yil degildir.");


    }
}
