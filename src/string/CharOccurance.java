package string;

public class CharOccurance {

    public static void main(String[] args) {

        String name="abcaqbcabczaa";

        charOccurance(name, 'z');


    }


    public static void charOccurance(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of "+ch+" in the word "+str+" is: "+count);
    }


}
