import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gr1, gr2, gr3, avrg;

        System.out.println("Let's determine your grade");
        System.out.println();

        System.out.println("Quiz Score: ");
        gr1 = sc.nextInt();

        System.out.println("Mid-Term Score: ");
        gr2 = sc.nextInt();

        System.out.println("Final Score: ");
        gr3 = sc.nextInt();

        avrg = (gr1 + gr2 + gr3) / 3;
        
        if ( avrg >= 90 && avrg == 100 ) {
            System.out.println("You got A!");
        } else if ( avrg <= 89 && avrg >= 80 ) {
            System.out.println("You got B!");
        } else if ( avrg <= 79 && avrg >= 70 ) {
            System.out.println("You got C!");
        } else if ( avrg <= 69 && avrg >= 69) {
            System.out.println("You got D!");
        }
        
        sc.close();
    }
}