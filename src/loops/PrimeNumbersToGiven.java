package loops;

public class PrimeNumbersToGiven {



    public static void main(String[] args) {

        //1
        String  primeNumbers = "";
        int last = 200;

        for (int i = 3; i <= last; i++){
            int counter=0;
            for(int j =2; j<i; j++){
                if(i%j==0)
                    counter++;
                continue;
            }
            if (counter ==0){
                System.out.println(i + " is a prime number");
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);


    }





}
