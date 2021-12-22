package string;

public class RemoveExtraSpaces {

    /**
        Cybertek java Interview Coding Tasks 27
        Remove All Extra Space from String
        Input: “ Hello world     I    love         Java ”
        Output: Hello world I love Java
     */

    public static void main(String[] args) {

        String str = " Hello world     I    love         Java ";

        System.out.println(removeExtraSpace(str));

    }

    public static String removeExtraSpace(String sentence){

        String[] words = sentence.trim().split(" ");
        String result="";

        for (String each:words) {
            if(!each.isEmpty()){
                result+= each+" ";
            }
        }
        return result.trim();
    }
}
