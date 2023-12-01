import java.util.Scanner;

public class ExerciseThree {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        boolean u;
        
        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input first number: ");
        x = sc.nextDouble();

        System.out.println("Input second number: ");
        y = sc.nextDouble();

        u = ( x <= 1 == true) && ( y <= 1 == true);

        if (u) {
           System.out.println("True");
        } else {
           System.out.println("False");
        }

        sc.close();

    }
}
