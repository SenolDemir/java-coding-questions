package control.statements;

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        //1
        String  primeNumbers = "";
        int last = 200;

        for (int i = 1; i <= last; i++){
            int counter=0;
            for(int num =i; num>=1; num--){
                if(i%num==0)
                    counter = counter + 1;
            }
            if (counter ==2){
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);


    }


}
