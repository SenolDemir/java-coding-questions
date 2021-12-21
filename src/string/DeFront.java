package string;

public class DeFront {

      /**
        Given a string, return a version without the first 2 chars.
        Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        The string may be any length. Harder than it looks.

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"
      */

    public static void main(String[] args) {



        System.out.println("deFront(\"Hello\") = " + deFront("Hello"));
        System.out.println("deFront(\"java\") = " + deFront("java"));
        System.out.println("deFront(\"away\") = " + deFront("away"));
        System.out.println("deFront(\"abay\") = " + deFront("abay"));
        System.out.println("deFront(\"cbay\") = " + deFront("cbay"));


    }

    public static String deFront(String str){
        str = str.toLowerCase();

       boolean a = str.charAt(0)=='a';
       boolean b = str.charAt(1)=='b';

       if (a==true && b==true ){
           str = str;
       }else if (a==true && b==false) {
           str = "a"+str.substring(2);
       }else if (a==false && b==true){
           str= str.substring(1);
       }else {
           str = str.substring(2);
       }
        return str;
    }
}
