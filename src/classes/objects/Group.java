package classes.objects;

public class Group {

    String firstName;
    String lastName;
    String gender;
    String role;
    int experience;
    static String company = "Apple";

    public void memberStatus(){

        System.out.println("The Information Of Member:");
        System.out.println( "Company   : " + company);
        System.out.println("Full Name  : " + firstName + " " + lastName);
        System.out.println("Gender     :" + gender);
        System.out.println("Role       : " + role);
        System.out.println("Experience : " + experience + " years");
    }

    public void task(int task){
        System.out.println(role + " " + firstName + " " + lastName + " is working on " + task + " tasks today");
    }
}
