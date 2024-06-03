package methods.recursive;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("Anadolu"));

    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, it is already reversed
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring starting from the second character and concatenate the first character
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
