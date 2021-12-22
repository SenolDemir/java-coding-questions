package string;

public class TimeStamp {

    public static void main(String[] args) {

        String date="07/01/2020 14:59:00";
        System.out.println(timeStamp(date));

    }

    public static String timeStamp (String date) {


        date=date.replace("/", "")
                .replace(" ", "")
                .replace(":", "");
        return date;
    }
}
