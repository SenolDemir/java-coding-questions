package control.statements;

public class PrintLetters {
    
    
    /*
        Print letters to given letter in alpahet
		Example: Given 'M'
		output: ABCDEFGHIJKLM
     */
    
    

    public static void main(String[] args) {

        char letter = 'Z';

        for (char start = 'A'; start <=letter ; start++) {
            System.out.print(start);
        }
        
    }
     
}
