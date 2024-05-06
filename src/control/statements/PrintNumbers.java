package control.statements;

public class PrintNumbers {

    public static void main(String[] args) {


        //1 den 100 kadar ucer ucer  yazdiralim
        for (int i = 1; i <100 ; i+=3) {
           System.out.println(i);
        }



        //00 e kadar olan sayilar icindeki 2 ye bolunebilen sayilari yazdiralim

        for (int i = 0; i <100 ; i++) {
            if(i%2==0) System.out.println(i);
        }

        //carpim tablosu yazdiralim

        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i + " * " +j + " = "+(i*j));
            }
            System.out.println();
        }

        //100 den geriye dogru sayilari yazdiralim
        for (int i = 100; i >0 ; i--) {
            System.out.println(i);
        }

        //1 , 2 , 3 , 4 , 5 , 7 , 8 , 9 , 10 . yaazdiralim

        for (int i = 1; i <=20 ; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b.");
    }
}
