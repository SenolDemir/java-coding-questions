package control.statements;

public class Museum {

    /**
        Sehirde bulunan muze hafta ici saat 10 ile aksam 20 arası ziyaerete acık.
        Bir program yazın, bu program verilen gün numarası ve saate göre müzenin acık olup olmadığını
        biza bildirsin.
        Gunleri 1 den 7 ye kadar numaraya göre, saati 0 dan 24 e kadar olacak şekilde ele alın
        Ornek:
        day --> 2
        saat  --> 14
        Output:
        Şu an müze açık
     */


    public static void main(String[] args) {

        int day = 7;
        int hour = 22;

        if (day>=1 && day<=5){
            if(hour>=10 && hour<=20){
                System.out.println("The museum is open now");
            }else {
                System.out.println("The museum is closed now");
            }
        }else {
            System.out.println("The museum is closed now");
        }
    }




}
