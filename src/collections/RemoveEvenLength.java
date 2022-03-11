package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenLength {

    /*
        Write a method removeEvenLength that takes an ArrayList of Strings as a parameter
        and removes all the strings of even length from the list.

        Burada dikkat edilecek husus şu:
        arraylist e loop ile ulaşılıp remove yapıldığında (daha once boyle yapıldı)
        index değiştiğinden atlamalar oluyor.
        Bu yüzden yeni bir arraylist le sonuçları almak dogru olur.
     */

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("This","a", "ise", "test"));
        removeEvenLength(str);
    }

    public static void removeEvenLength(ArrayList<String> str) {
        ArrayList<String> result = new ArrayList<>();

        for (int i=0; i<str.size(); i++){
            if(!(str.get(i).length()%2==0)){
                result.add(str.get(i));
            }
        }
        System.out.println(result);
    }


}
