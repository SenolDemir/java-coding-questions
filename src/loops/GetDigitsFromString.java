package loops;

public class GetDigitsFromString {

    public static void main(String[] args) {

        String s = "anka145dfdgdd6789";

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<10; j++){
                if( s.substring(i,i+1).contentEquals(""+j)){
                    System.out.print(j);
                }
            }
        }



    }
}
