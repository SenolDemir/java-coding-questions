package operators;

public class TernaryOperator {


    public static void main(String[] args) {

        /*
         Write a program to display whether the number is an odd number or even number by using ternary operator:
         Sample: 331341 is odd number
         */

        int num = 331340;
        System.out.println((num%2==0 ? "Even Number" : "Odd Number"));

        System.out.println("---------------------------------------------------");

        /*
        Write a program that checks if a student passed the exam or not by using ternary operator:
        Sample1: Your mark is 80 and you passed
        Sample2: Your mark is 45 and you failed. You needed 5 more points to pass the exam
         */

        int mark = 40;
        System.out.println((mark>=50 ? "Your mark is " + mark + " and you passed" : "Your mark is " + mark + " and you failed. You needed " + (50-mark) + " more points to pass the exam"));

        /*
            Soru 3) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
            50’den kucukse “D”,
            50-60 arasi “C”,
            60-80 arasi “B”,
            80’nin uzerinde ise “A” yazdirin
        */

        int not = 110;

        String mark1 = not<50 ?  "D" :
                not<60 ? "C":
                        not<80 ? "B":
                                not<100 ? "A":
                                        "Wrong Mark";

        System.out.println(mark1);
    }


}
