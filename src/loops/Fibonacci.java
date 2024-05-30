package loops;

public class Fibonacci {

    public static void main(String[] args) {

        //1, 2, 3, 5, 8, 13, ...


        int a= 0;
        int b = 1;
        int c;
        int count = 15;


        for (int i = 0; i < count; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.print(c + ", ");


        }
    }
}
