import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, c, a;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input value of radiues: ");
        r = sc.nextDouble();

        c = 2 * (Math.PI * r);
        a = Math.PI * (r * r);

        System.out.println("The value in circumference " + c);
        System.out.println("The value in area " + a);

        sc.close();
    }
}
