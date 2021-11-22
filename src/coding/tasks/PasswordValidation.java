package coding.tasks;

public class PasswordValidation {
    public static void main(String[] args) {

        /**
        6. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise
        returns false
         */

        String password = "Ad123456";
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

       boolean hasLower = password.matches(lowercase);
       boolean hasUpper = password.matches(uppercase);
       boolean hasNumber = password.matches(numbers);
       boolean hasSpecial = password.matches(specialchars);

       if (password.length()>=6 && !password.contains(" ")){
           if (hasLower && hasUpper && hasNumber && hasSpecial){
               System.out.println("Valid");
           }
           }System.out.println("Invalid");
       }




    }

