package loops;

public class SumOfAllNumbersToGiven {

    public static void main(String[] args) {


        //1 All numbers
        int num = 100;
        int sum = 0;
        for (int i = 0; i <=num ; i++) {
            sum+=i;
        }
        System.out.println("The sum of all numbers between 0 and " + num + " is: " + sum);


        System.out.println("--------------------------------------");

        // numbers which can be divided 2
        int number=0;
        int result=0;

        while (number<=100 ) {
            if (number%2==0) {
                result+=number;
            }
            number++;
        }
        System.out.println(result);
    }
}
