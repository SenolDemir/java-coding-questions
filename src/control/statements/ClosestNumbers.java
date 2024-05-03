package control.statements;

public class ClosestNumbers {

    public static void main(String[] args) {

        int a=210;
        int b=120;
        int c = 200;
        int abDiff, acDiff, bcDiff;


        if(a>b) abDiff= a-b;
        else abDiff = b-a;

        if(a>c) acDiff= a-c;
        else acDiff = c-a;

        if(b>c) bcDiff = b-c;
        else bcDiff = c-b;

        if(abDiff<bcDiff && abDiff<acDiff){
            System.out.println("The most closer numbers: " + a +" and " + b);
        }else if(acDiff<bcDiff){
            System.out.println("The most closer numbers: " + a +" and " + c);
        }else {
            System.out.println("The most closer numbers: " + b +" and " + c);
        }

        // 2
        // By using Math Class

        abDiff = Math.abs(a-b);
        acDiff = Math.abs(a-c);
        bcDiff = Math.abs(b-c);

        if(abDiff<bcDiff && abDiff<acDiff){
            System.out.println("The most closer numbers: " + a +" and " + b);
        }else if(acDiff<bcDiff){
            System.out.println("The most closer numbers: " + a +" and " + c);
        }else {
            System.out.println("The most closer numbers: " + b +" and " + c);
        }



    }
}
