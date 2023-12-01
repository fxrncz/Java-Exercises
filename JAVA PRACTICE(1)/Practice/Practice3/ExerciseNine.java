import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double sum;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Enter your first number: ");
        x = sc.nextInt();

        System.out.println("Enter your second number: ");
        y = sc.nextInt();

        System.out.println("Enter your third number: ");
        z = sc.nextInt();

        sum = (x + y + z) / 3;

        System.out.println("The average of your chosen 3 numbers is " + sum);

        sc.close();
    }
}
