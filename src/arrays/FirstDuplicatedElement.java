package arrays;

public class FirstDuplicatedElement {

    /**
        Interview Coding 39
        Write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,78,4,37,45,78};

        System.out.println(firstDuplicatedElement(arr));

    }

    public static int firstDuplicatedElement(int[] array){
        int firstDuplicated = 0;
        for (int each : array) {
            int frequency = 0;
            for(int each2 : array){
                if(each == each2)
                    frequency++;
            }
            if(frequency>1){
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }
}
