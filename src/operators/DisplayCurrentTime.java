package operators;

public class DisplayCurrentTime {

    /*
    Write a Java program that prints the current time in GMT.

    Test Data
    Input the time zone offset to GMT: 256
    Expected Output:
    Current time is 23:40:24
     */


    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis(); // This is in milliseconds
        System.out.println(currentTime);

        long totalMilliseconds = System.currentTimeMillis();
        int timeZoneChange = +2;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours+timeZoneChange)%24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);







    }
}
