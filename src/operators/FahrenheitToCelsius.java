package operators;

public class FahrenheitToCelsius {

    /*

    Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
    Test Data
    Input a degree in Fahrenheit: 212
    Expected Output:
    212.0 degree Fahrenheit is equal to 100.0 in Celsius

    C = (F-32) * 5/9
    F = (C * 9/5) + 32
     */

    public static void main(String[] args) {


        double fahr = 234;

       double celsius = (fahr-32) * 5/9;
        System.out.println(fahr + " fahrenheit is " + celsius + " celsius");


    }
}
