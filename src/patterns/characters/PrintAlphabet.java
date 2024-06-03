package patterns.characters;

public class PrintAlphabet {


    public static void main(String[] args) {

        char letter = 'a';
        //letter++;
        //letter++;
        //System.out.println(letter);

        while(letter<='z') {
            System.out.print(letter+ " ");
            letter++;
        }

        System.out.println("-------------------------------------");
        System.out.println();
        char letter2 = 'o';

        while(letter2>='a') {
            System.out.print(letter2 + " ");
            letter2--;
        }

        System.out.println("-----------------------------------------------------");

		/*
		 A
		 AB
		 ABC
		 ABCD
		 ABCDE
		 ......
		 ABC.......Z
		 */

        char myLetter = 'A';
        String alphabet = "";

        while(myLetter <='Z') {
            //attach/concat myLetter to alphabet
            alphabet += myLetter;
            //print
            System.out.println(alphabet);
            //A
            //AB
            //ABC
            myLetter++;  //C
        }

    }
}
