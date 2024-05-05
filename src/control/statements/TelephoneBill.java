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

        int call = 190;
        int addCall;
        double bill = 200;
        double addBill = 0;



        if(call>100){
            addCall = call-100;

           if (addCall<=50){
               addBill = addCall * 0.60;
           } else if (addCall<=100) {
               addBill = (50 * 0.60) + ((addCall-50)*0.50);
           } else if (addCall>100) {
               addBill = (50 * 0.60) + (50 * 0.50) + (addCall-100)*0.40;
           }
           bill = bill+addBill;
            System.out.println("$" +bill);
        }else{
            System.out.println("The bill is $" + bill);
        }
    }
    
    

}
