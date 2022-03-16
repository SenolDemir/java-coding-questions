package string;

import java.util.function.Predicate;

public class PasswordValidation {

    /***
        Interview Coding Questions 6
        Write a method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least 8 characters
        2. Password should at least contain one uppercase letter
        3. Password should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        if all requirements above are met, the password is valid, if not all are met it is invalid
     */

    public static void main(String[] args) {

        String password = "a?G6jdsaja" ;

        boolean length = password.length()>=8;
        boolean upperCase = password.matches(".*[A-Z].*");
        boolean lowerCase = password.matches(".*[a-z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean specials = password.matches(".*[!@.,#$?].*");

        boolean valid = length && upperCase && lowerCase && number && specials;

        if(valid)
            System.out.println("password is valid");
        else
            System.out.println("password is not valid");

        System.out.println("---------------------------------------");

        //2

        System.out.println(passwordValidation("a?G6jdsaja"));

        System.out.println("------------------------------------------");

        //3 with Functional Interface

        Predicate<String> passwordValidation2 = s -> {
            boolean length2 = password.length()>=8;
            boolean upperCase2 = password.matches(".*[A-Z].*");
            boolean lowerCase2 = password.matches(".*[a-z].*");
            boolean number2 = password.matches(".*[0-9].*");
            boolean specials2 = password.matches(".*[!@.,#$?].*");

            return length && upperCase && lowerCase && number && specials;
        };

        System.out.println(passwordValidation2.test("a?G6jdsaja"));


    }

    public static boolean passwordValidation(String password) {

        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialChars="(.*[ -/, :-@].*)";
        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialChars),
                Valid = false;
        if(password.length() >= 6 && !password.contains(" "))
            if( HasLower && HasUpper && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }
}
