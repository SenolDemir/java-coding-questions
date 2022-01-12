package string;

public class CheckWord {

    /*
    Write a method that accepts 2 strings(str1,str2) and checks
    if second string exist in first one.
    If second exists, should print the position index.
     */

    public static void main(String[] args) {

        checkWord("Your parcel is delivered to your postcode: DA124DA", "delivered");


    }

    public static void checkWord(String str1, String str2){
            if(str1.contains(str2)){
                System.out.println("The index of "+str2+ " is "+ str1.indexOf(str2) );
            }else {
                System.out.println(str2 + " does not exist!");
            }


    }
}
