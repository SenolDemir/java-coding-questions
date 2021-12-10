package methods;

public class StringTimes {

    /**
        CodingBat
        Write a method that accepts a string and a non-negative number,
        and prints a larger string that is number copies of the original String
        stringTimes("Hi", 2); = > HiHi
        stringTimes("Hi", 3); = > HiHiHi
        stringTimes("Hi", 1); = > Hi
     */

    public static void main(String[] args) {

        stringTimes("Hi", 5);

    }

    public static void stringTimes (String str, int a){

        for(int i=0; i<a; i++){
            System.out.print(str);
        }


    }
}
