package control.statements;

public class BilgeHanim {

    public static void main(String[] args) {

        int a=4;
        int b=-5;
        boolean negative=false;


        if (negative){
            if(a<0 && b<0){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        } else {
            if (a<0 && b>0 || a>0 && b<0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
