package operators;

public class MinutesToYear {

    public static void main(String[] args) {

        // 3456789

        int year =  3456789/60/24/365;
        int days =  (3456789/60/24)%365;

        System.out.println("year = " + year);
        System.out.println("days = " + days);
    }
}
