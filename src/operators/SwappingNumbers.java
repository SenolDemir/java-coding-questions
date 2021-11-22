package operators;

public class SwappingNumbers {

    public static void main(String[] args) {

        /**
         This is an interview question *
         What is the algorithm of swapping two numbers in coding.
         Both way!
         */

        int a = 12;
        int b = 26;

        //1 with third variable
        int c = a+b;
        a = c -a;
        b = c-a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2 without third variable
        a = a +b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
