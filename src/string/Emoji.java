package string;

public class Emoji {

    /**
        Create a emoji program:
        1- Check if emoji has 2 characters. If it is not, print “invalid emoji”
        2-Valid emojis:
        Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful, Otherwise invalid
        Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
     */

    public static void main(String[] args) {

        String em = ":(";
        System.out.println(emoji(em));
    }

    public static String emoji(String emoji){

        String result = "";
        if(emoji.length() !=2){
            return "Invalid Emoji";
        }
        char firstChar = emoji.charAt(0);
        char secondChar = emoji.charAt(1);
        if(firstChar==':'){
            if(secondChar==')'){
                result =  "Smile";
            }else if(secondChar=='('){
                result = "Sad";
            }else if(secondChar=='/'){
                result = "Upset";
            }else if(secondChar=='p'){
                result = "Playful";
            }else{
                result = "Unkown emoji";
            }
        }else if(firstChar==';'){
            if(secondChar==')'){
                System.out.println("Wink");
                result = "Wink";
            }else if(secondChar=='0'){
                result = "Surprised";

            }else{
                result = "Unkown emoji";
            }
        }
        return result;
    }




}
