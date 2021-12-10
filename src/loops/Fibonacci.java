package loops;

public class Fibonacci {

    /**
        Fibonacci Dizisi, her sayının kendisinden bir önceki sayı ile toplanması ile
        elde edilen sayılar serisidir.
        Fibonacci Disizinde yer alan rakamların özelliği,
        Fibonacci Dizisinde yer alan sayıların kendilerinden bir öncekiyle oranlandığında oluşan
        serinin altın orana yaklaşarak ilerlemesidir.
     */

    public static void main(String[] args) {

        // 1
        //while loop to calculate fibonacci series up to n numbers
        int n = 100, t1 = 0, t2 = 1;
        System.out.print("Upto " + n + ": ");

        while (t1<= n){
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        System.out.println();

        // 2
        // 15) baslangic rakamlari 1 ve 2 olarak 15 tane fibonacci rakami yazdiralim.
        int f1 = 1;
        int f2 = 2;
        int counter = 15;
        System.out.println("Printing " + counter + " fibonacci numbers :");

        for (int i = 1; i < counter; i++) {
            System.out.print(f1 + " ");
            int total = f1+f2;
            f1=f2;
            f2=total;

        }

        System.out.println();
        System.out.println("-------------------------------");

        // starts with 1 1 2 3 5 ..
        int a = 1;
        int b = 1;

        for(int i=0; i<12; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }





    }
}
