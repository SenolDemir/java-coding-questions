package operators;

public class Circle {

     /**
        Write a Java program that displays the area and perimeter of a circle that
        has a radius of 5.5 using the following formulas:
        perimeter = 2 * radius * 𝜋
        area = radius * radius * 𝜋
     */

    public static void main(String[] args) {

        double radius = 5.5;
        double pi = 3.14;

        double perimeter = radius * pi * 2;
        System.out.println("perimeter = " + perimeter);

        double area = radius * radius * pi;
        System.out.println("area = " + area);


    }
}
