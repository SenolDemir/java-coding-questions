package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ParkPay {


    public static void main(String[] args) throws ParseException {

        String time1 = "08:30:00";
        String time2 = "12:45:50";

        // Only hours
        System.out.println(parkPay(time1, time2));

        // Only hours with ChronoUnit
        System.out.println(parkingPay(time1, time2));


        // With full date and time using TimeUnit
        String time3 = "12-12-2021 08:30:45";
        String time4 = "13-12-2021 17:15:05";
        System.out.println(parkPayFully(time3, time4));


    }


    public static double parkPay(String startTime, String endTime) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time1 = formatter.parse(startTime);
        Date time2 = formatter.parse(endTime);

        long timeInMilliSecond = Math.abs(time2.getTime() - time1.getTime());
        long timeInSecond = (timeInMilliSecond / 1000) %60;
        long timeInMinutes = (timeInMilliSecond / ( 1000 * 60 )) % 60;
        long timeInHour = (timeInMilliSecond / (1000 * 60 * 60) ) % 24;

        System.out.println("timeInHour = " + timeInHour);

        return timeInHour * 1.80;
    }

    public static double parkingPay(String startTime, String endTime) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime start = LocalTime.parse(startTime,formatter);
        LocalTime end = LocalTime.parse(endTime, formatter);

        long hours = ChronoUnit.HOURS.between(start, end);
        long minutes = ChronoUnit.MINUTES.between(start,end) % 60;
        System.out.println("hours = " + hours);

        return hours * 1.80;
    }

    public static double parkPayFully(String time1, String time2) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = sdf.parse(time1);
        Date date2 = sdf.parse(time2);

        long timeInMilliSecond = date2.getTime()-date1.getTime();
        System.out.println("timeInMilliSecond = " + timeInMilliSecond);

        long timeInHour = TimeUnit.MILLISECONDS.toHours(timeInMilliSecond);
        System.out.println(timeInHour);

        return timeInHour*1.80;
    }
}
