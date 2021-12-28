package string;

public class ReverseString {

    /**
        Interview Coding Task 4
        Write a return method that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {


        //1  for loop
        reverse("Java Programming");

        //2 StringBuffer
        System.out.println(reverseWithBuffer("Java Programming"));


    }

    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+= str.charAt(i)+"";
            // or  reversed+= str.toCharArray()[i];
        }
        System.out.println(reversed);

        return reversed;
    }

    public static String reverseWithBuffer(String str){
        String result = new StringBuffer(str).reverse().toString();
        return result;
    }
}
