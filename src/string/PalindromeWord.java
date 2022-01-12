package string;

public class PalindromeWord {

    /*
        A word is called a palindrome word if the reverse of it is the same as the original.
	    For example, radar, level, wow, carerac, level, madam, etc
	    ey edip adanada pide ye
	    Create a program to check if given string is a palindrome word or not.

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
