package string;

public class VowelChars {

    /**
        Write a program to print only vowel (a,e,o,i,u) in given string
        String word = “Hello World";
        Output: e,o,o
     */

    public static void main(String[] args) {


        String str="CybertekSchool";
        str.length();

        for (int i=0; i<str.length();i++) {
            char letter=str.charAt(i);
            if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
                System.out.print(letter + " ");
            }
        }


    }
}
