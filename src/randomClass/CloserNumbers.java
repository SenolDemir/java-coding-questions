package randomClass;

public class CloserNumbers {

    /*
      Write a method to find closest two numbers between given three numbers
      by using Math class?
     */

    public static void main(String[] args) {

        closerNumbers(10, 20, 30);

    }

    public static void closerNumbers(int a, int b, int c){

        int abDiff = Math.abs(a-b);
        int acDiff = Math.abs(a-c);
        int bcDiff = Math.abs(b-c);

        if(abDiff==bcDiff && abDiff<acDiff){
            System.out.println("Difference between " + a + " and " + b + " is same as " + b +" and " + c);
        }else if(acDiff==bcDiff && acDiff<abDiff){
            System.out.println("Difference between "+ a + " and "+ c + " are same as " + b +" and " + c);
        }else if(abDiff<bcDiff && abDiff<acDiff){
            System.out.println("The most closer numbers: " + a +" and " + b);
        }else if(acDiff<bcDiff){
            System.out.println("The most closer numbers: " + a +" and " + c);
        }else {
            System.out.println("The most closer numbers: " + b +" and " + c);
        }





    }


}
