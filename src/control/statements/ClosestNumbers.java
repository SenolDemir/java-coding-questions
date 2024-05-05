package control.statements;

public class ClosestNumbers {


    public static void main(String[] args) {


        int a = 210;
        int b = 20;
        int c = 300;

        int aDiffb, aDiffc, bDiffc;

        if (a > b) aDiffb = a - b;
        else aDiffb = b - c;

        if (a > c) aDiffc = a - c;
        else aDiffc = a - c;

        if (b > c) bDiffc = b - c;
        else bDiffc = c - b;

        if (aDiffb < aDiffc && aDiffb < bDiffc) {
            System.out.println("The closest number is :" + a + " and " + b);
        } else if (aDiffc < bDiffc) {
            System.out.println("The closest number is :" + a + " and " + c);
        } else {
            System.out.println("The closest number is :" + b + " and " + c);
        }


    }


}
