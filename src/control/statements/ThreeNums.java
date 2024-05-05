package control.statements;

public class ThreeNums {

      /**
        in this problem you need to write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3
        if n1 is biggest output: ""n1 is bigger""
        if n2 is biggest output: ""n2 is bigger""
        if n3 is biggest output: ""n3 is bigger""

         for example:
            n1 = 1
            n2  = 2
            n3  = 1
        output: ""n2 is bigger""
            n1 = 3
            n2  = 2
            n3  = 1
        output: ""n1 is bigger""
            n1 = 3
            n2  = 2
            n3  = 30
        output: ""n3 is bigger"""

         */

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 3;
        int n3 = 5;

       if (n1==n2 && n1>n3){
           System.out.println("The biggest numbers are n1 and n2");
       }else if(n1>n2 && n1>n3){
           System.out.println("The biggest numbers are n1: "+ n1);
       }else if(n2==n3 && n2>n1){
           System.out.println("The biggest numbers are n2 and n3: " + n3);
       } else if (n2>n3) {
           System.out.println("The biggest numbers are n2: "+ n2);
       } else if (n1==n3 && n1>n2) {
           System.out.println("The biggest numbers are n1  and n3: " + n3);
       }else {
           System.out.println("The biggest numbers are n3: "+ n3);
       }


    }
}
