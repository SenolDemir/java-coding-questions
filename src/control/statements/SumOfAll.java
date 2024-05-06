package control.statements;

public class SumOfAll {

    public static void main(String[] args) {

        //0 dan 200 e kadar olan sayilarin toplami

        int sum =0;

        for (int i = 0; i <=200 ; i++) {
            sum+=i;

        }
        System.out.println(sum);
    }
}
