import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;


        System.out.println("Test Data: ");
        System.out.println();

        System.out.println("Input an integer: ");
        x = sc.nextInt();

        if ( x % 2 == 0 && x % 3 == 0 && x % 5 == 0) {
            System.out.println("Ugly number");
        } else {
            System.out.println("That's okay");
        }
        sc.close();
    }
}