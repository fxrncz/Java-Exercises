import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int fact = 1;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Enter an integer: ");
        num1 = sc.nextInt();

        for (int x = 1; x <= num1; x++) {
            fact *= x;
        }
        System.out.println("Factorial number is " + fact);
        
        if (fact % 2 == 0) {
            System.out.println("This number is even " + fact);
        } else {
            System.out.println("This number is odd");
        }
        sc.close();
    }
}
