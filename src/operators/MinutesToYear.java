package operators;

public class MinutesToYear {

    public static void main(String[] args) {

        // 3456789

       int min = 3456789;
        int minBalance = min%60;
        System.out.println(minBalance);
        int hour = (min-minBalance) / 60;
        int hourBalance = hour%24;
        int day = (hour-hourBalance) / 24;
        System.out.println(day);
        int dayBalance = day%365;
        int year = (day-dayBalance)/365;
        System.out.println(year);
        System.out.println(min + " minutes is: " + year + " years " + dayBalance + " days " + hourBalance +" hours " + minBalance + " minutes");

        // Second  Solution
        double minutesInYear = 60 * 24 * 365;
        long years = (long) (min /minutesInYear);
        int days = (int) (min/60/24) % 365;
        System.out.println(min + " minutes is: " + years + " years " + days +" days");




    }
}
