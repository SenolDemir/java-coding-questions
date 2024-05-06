package control.statements;

public class FizzBuzz {

    public static void main(String[] args) {

        /*
            1 den 100 e kadar olan sayıları ayrı satırlarda yazdıralım.
            Yazdırırken 3 ün katı olan sayının yerine "Fizz",
            5 in katı olan sayının "Buzz"
            hem 3 un hem 5 in katı olan sayıların yerine de "FizBuzz" yazdırıyor olmalıyız.
             */

        for (int i = 1; i <=100; i++) {
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            } else if (i%3==0 && i%5!=0) {
                System.out.println("Fizz");
            } else if (i%3!=0 && i%5==0) {
                System.out.println("Buzz");
            }else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
        }
        }
    }
}
