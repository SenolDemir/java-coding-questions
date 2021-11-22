package control.statements;

public class Score {

    public static void main(String[] args) {

        int score = 110;

        if(score>=90 && score<=100){
            System.out.println("Puan A");
        }else if (score>=81){
            System.out.println("Puan B");
        }else if(score>=69){
            System.out.println("Puan C");
        }else if(score>=41){
            System.out.println("Puan D");
        }else if(score>=0){
            System.out.println("Puan F");
        }else{
            System.out.println("HATALİ DEGER");
        }
    }
}
