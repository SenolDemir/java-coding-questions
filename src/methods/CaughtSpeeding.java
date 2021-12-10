package methods;

public class CaughtSpeeding {

        /**
        CodingBat Logic 1
        You are driving a little too fast, and a police officer stops you.
        Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        If speed is 60 or less, the result is 0.
        If speed is between 61 and 80 inclusive, the result is 1.
        If speed is 81 or more, the result is 2.
        Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        */

        public static void main(String[] args) {

            caughtSpeeding(78, false);

        }

        public static void caughtSpeeding(int speed, boolean birthday){

            int result = 0;

            if (birthday) {
                if (speed<=65)  result=0;
                else if (speed>=66 && speed<=85) result=1;
                else if (speed>=86) result=2;
            }else {
                if (speed<=60) result=0;
                else if (speed>=61 && speed<=80) result=1;
                else if (speed>=81)  result=2;

            }

            if(result==0) System.out.println("No Ticket");
            else if(result==1) System.out.println("Small Ticket");
            else if(result==2) System.out.println("Big Ticket");

        }
}
