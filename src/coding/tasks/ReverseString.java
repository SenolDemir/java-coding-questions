package coding.tasks;

public class ReverseString {

    /**
        4. Write a return method that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String str = "ABCD";
        String reversed = "";

        for (int i = str.length()-1; i >=0; i--) {
            reversed+= str.charAt(i)+"";
            // or  reversed+= str.toCharArray()[i];
        }

        System.out.println(reversed);

    }
}
