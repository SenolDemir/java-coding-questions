package patterns.characters;

public class KShapeCharacters {

    /*
        K Shape Character Pattern Program
        A B C D E F
        A B C D E
        A B C D
        A B C
        A B
        A
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

     */

    public static void main(String[] args) {


        for (int i = 6; i >0 ; i--) {
            int temp = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }

        for (int i = 0; i <=6 ; i++) {
            char temp = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }

    }



}
