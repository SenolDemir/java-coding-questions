package methods;

public class WriteStringMethod {

    public static void main(String[] args) {

            typingString("Hello", 5);

    }

    public static void typingString (String str, int a){

        for(int i=0; i<a; i++){
            System.out.println(str);
        }


    }
}
