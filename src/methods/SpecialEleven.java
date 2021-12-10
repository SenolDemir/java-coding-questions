package methods;

public class SpecialEleven {

    /**
     CodingBat Logic 1
     We'll say a number is special if it is a multiple of 11 or if it is one
     more than a multiple of 11. Return true if the given non-negative number
     is special.
    */

    public static void main(String[] args) {

        specialEleven(127);


    }

    public static void specialEleven(int n) {

        if (n>=11 && (n%11==0 || (n-1)%11==0)) {
            System.out.println(n +" is a special eleven");
        }else {
            System.out.println(n +" is NOT a special eleven");
        }
    }

}
