package classes.objects;

public class GroupTest {

    public static void main(String[] args) {

        Group m1 = new Group();
        m1.firstName = "Mike";
        m1.lastName = "Smith";
        m1.gender = " Male";
        m1.role = "Tester";
        m1.experience = 2;

        m1.memberStatus();
        m1.task(5);
    }


}
