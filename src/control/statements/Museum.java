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


        int day = 4;
        int saat = 27;

        if (day>0 && day<6){
            System.out.println("Hafta ici");
            if(saat>=10 && saat<=20){
                System.out.print("Muze su an acık");
            }else if ((saat>0 && saat<10) || (saat>20 && saat<24) ){
                System.out.println("Muze su an kapalı");
            }else{
                System.out.println("yanlıs saat girdiniz");
            }
        }else if (day==6 || day==7){
            System.out.print("Hafta sonu");
            System.out.println("Bugun Muze Kapalı");
        }else{
            System.out.println("Hatalı gun girdiniz");
        }






    }
}
