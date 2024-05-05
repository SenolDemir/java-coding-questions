package control.statements;

public class BodyMassIndex {

    /**
     BMI = mass / (height * height)
     The body mass index (BMI) is used to estimate the risk of weight-related problems
     based on a subject's height and mass. It was designed by the mathematician
     Adolphe Quetelet in the 1800s and is sometimes referred to as the Quetelet index.
     The BMI is computed as:
     BMI = mass / (height * height)

     In this formula, mass is in kilograms and height is in meters.
     The health risk associated with a BMI value is

     - Underweight<18.5
     - Normal Weight>=18.5 and <25
     - Overweight>=25 and <30
     - Obese>=30

     */


    public static void main(String[] args) {

        double mass = 120;
        double height = 1.76;
        double BMI = mass/ (height*height);
        System.out.println(BMI);

        if(BMI<20){
            System.out.println("Underwight");
        } else if (BMI>=20 && BMI<25) {
            System.out.println("Normal Weight");
        } else if (BMI>=25 && BMI<30) {
            System.out.println("Overweight");
        } else if (BMI>=30) {
            System.out.println("Obese");
        }

    }



}
