package control.statements;

public class TelephoneBill {

    /**
     (Java EU3 Assignment 4 Question 4)
     Write a Java program to calculate the monthly telephone bills as
     per the following rule:
     Minimum $200 for up to 100 calls.
     Plus $0.60 per call for the next 50 calls.
     Plus $0.50 per call for the next 50 calls.
     Plus $0.40 per call for any call beyond 200 calls.
     */

    public static void main(String[] args) {




        int call=190;


        if(call<=100) {
            System.out.println("$" + 200);
        }else if (call>100 && call<=150) {
            double cost1=(call-100)*0.60;
            System.out.println("$" + (cost1+200));
        }else if(call>150 && call<=200) {
            double cost2=(call-150)*0.50+(50*0.60);
            System.out.println("$" + (cost2+200));
        }else if(call>200) {
            double cost3=(call-200)*0.40+(50*0.60+50*0.50);
            System.out.println("$" + (cost3+200));
        }

    }
}
