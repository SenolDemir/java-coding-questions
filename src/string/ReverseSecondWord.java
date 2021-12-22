package string;

public class ReverseSecondWord {

    /**
        Cybertek java Interview Coding Tasks 28
        Reverse the second word ONLY
        Ex:
        Input: I Love Java
        OutPut: I evoL Java
     */

    public static void main(String[] args) {

        String str = "I Love Java";

        System.out.println(reverseSecondWord(str));

    }

    public static String reverseSecondWord(String sentence){
        String[] words = sentence.split(" ");
        String reversed = "";
        String result = "";

        for (int i = words[1].length()-1; i >=0; i--) {
            reversed += words[1].charAt(i)+"";
        }
        words[1]=reversed;
        for (String each: words) {
            result+=each+" ";
        }
        return result;
    }
}
