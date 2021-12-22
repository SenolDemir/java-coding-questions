package string;

public class PalindromeWord {

    /*
        Palindrome Words: wow, carerac, level, madam, ...
     */

    public static void main(String[] args) {

        System.out.println(isPalindrome("carerac"));
        System.out.println(isPalindrome("Java"));

    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String dummy = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            dummy+=str.charAt(i);
        }
        System.out.println(dummy);
        return str.equals(dummy);
    }



}
