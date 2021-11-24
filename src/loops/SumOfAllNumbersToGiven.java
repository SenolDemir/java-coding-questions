package loops;

public class SumOfAllNumbersToGiven {

    public static void main(String[] args) {

        int number=0;
        int result=0;

        while (number<=100 ) {
            if (number%2==0) {
                result=result+number;
            }
            number++;
        }
        System.out.println(result);
    }
}
