package operators;

public class BodyMassIndex {


    /*
        Write a Java program to compute the body mass index (BMI).

        Test Data
        Input weight in kg: 452
        Input height in cm: 72
        Expected Output:
        Body Mass Index is 61.30159143458721

        BMI = mass / (height * height)
     */

    public static void main(String[] args) {

        double mass= 89;
        double height = 1.82;
        double BMI = mass / (height * height);
        System.out.println("Body Mass Index is: " + BMI);




    }



}
