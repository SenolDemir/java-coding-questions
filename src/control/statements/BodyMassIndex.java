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


        double mass = 89;
        double height = 1.82;

        double BMI = mass / (height * height);

        System.out.println("BMI = " + BMI);

        if (mass<20){
            System.out.println("Your are under normal rate");
        }else if (mass>=20 && mass<27){
            System.out.println("Your are in normal rate");
        }else if (mass>=27 && mass<32){
            System.out.println("Your are over weight");
        }else if (mass<32){
            System.out.println("Your are obezz");
        }

    }
}
