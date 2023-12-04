import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int midTerm, qz, fnl, avrg;

        System.out.println("Input your Quiz Score: ");
        qz = sc.nextInt();

        System.out.println("Input your Midterm: ");
        midTerm = sc.nextInt();

        System.out.println("Input your Final grade: ");
        fnl = sc.nextInt();

        avrg = (midTerm + qz + fnl) / 3;

        if (avrg == 90) {
            System.out.println("Grade: A");
        } else if (avrg >= 70 && avrg < 90) {
            System.out.println("Grade: B");
        } else if (avrg >= 50 && avrg < 70) {
            System.out.println("Grade: C");
        } else if (avrg < 50) {
            System.out.println("Grade: D");
        }
        sc.close();
    }
}
