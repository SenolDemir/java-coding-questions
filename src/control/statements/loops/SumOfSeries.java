package control.statements.loops;

public class SumOfSeries {


    public static void main(String[] args) {

        //1 den 100 e kadar olan tüm sayıların toplamını verecek bir program yazalım

        int sum = 0;

        for (int i = 0; i <=100 ; i++) {
            sum+=i;
        }

        System.out.println(sum);
    }
}
