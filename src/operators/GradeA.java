package operators;

public class GradeA {

        /**
        The total number of students in a class are 90 out of which 45 are boys.
        If 50% of the total students secured grade
        'A' out of which 20 are boys, then write a program to
        calculate the total number of girls getting grade 'A'.

        Bir sınıfta bulunan toplam 90 öğrencinin 45 i erkek.
        %20'si erkek olmak üzere toplam öğrencilerin %50'si 'A' notu almışsa,
        'A' notu alan kızların toplam sayısını hesaplayan bir program yazınız.

         */

    public static void main(String[] args) {



        int totalStudent = 90;
        int totalBoyStudent = 45;
        int gradeA = (totalStudent *50)/100;
        System.out.println("gradeA = " + gradeA);

        int boyGradeA = (gradeA*20)/100;
        System.out.println("boyGradeA = " + boyGradeA);

        int girlGradeA = gradeA-boyGradeA;
        System.out.println("girlGradeA = " + girlGradeA);
    }
}
