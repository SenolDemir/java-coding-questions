package control.statements.loops;

public class DividedBySeven {


    public static void main(String[] args) {

        //0-3000 arasi 7 ye bolunebilenn kac sayi vardir.
        int count = 0;

        for (int i = 0; i <=3000; i++) {
            if(i!=0 && i%7==0){
                count++;
                System.out.println(i + "/7 = " +(i/7));
            }
        }
        System.out.println(count);
    }
}
