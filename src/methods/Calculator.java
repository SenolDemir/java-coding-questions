package methods;

public class Calculator {

    public static void main(String[] args) {

        calculater(4, 6, "*");

    }

    public static void calculater (int num1, int num2, String operator) {

        switch (operator) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
        }
    }
}
