package methods;

public class RetirementAge {

    /**
    Retirement Year
    Write a java method to give the retirement situation of candidate according to given name and birthyear.
    Retirement year is 65.
    Not use one more method to calculate age of candidate and call it from the other one
     */

    public static void main(String[] args) {

        retirement("Ahmet", 1950);


    }

    public static void retirement(String name, int birthYear){

        int age = 2021 - birthYear;
        if(age>65){
            System.out.println("Hi " + name + "! You can get retired");
        }else{
            System.out.println("Hi " + name + "! Your retirement is " +(65-age)  + " years later");
        }

    }

}
