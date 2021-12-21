package string;

public class CharOccurance {

    public static void main(String[] args) {

        String name="abcaqbcabcaa";
        name.charAt(0);
        name.length();
        int count=0;

        for (int i=0; i<name.length(); i++) {
            if (name.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println("Number of a in this word is " + count);
    }


}
