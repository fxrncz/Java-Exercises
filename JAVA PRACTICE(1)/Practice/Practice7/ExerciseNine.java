import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input first floating number: ");
        num1 = sc.nextFloat();

        System.out.println("Input second floating number: ");
        num2 = sc.nextFloat();

        if (num1 == num2 && num2 == num1) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not");
        }
        sc.close();
    }
}
