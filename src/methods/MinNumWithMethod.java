package methods;

public class MinNumWithMethod {

    public static void main(String[] args) {

        //Write a Java method to find the smallest number among three numbers


        minNumber();


    }

    public static void minNumber (){
        int a = 15;
        int b= 19;
        int c = 34;
        int min = 0;
        if(a<b && a<c){
            min = a;
        }else if(b<c){
            min = b;
        }else {
            min = c;
        }
        System.out.println("minimum number is " + min);
    }
}
