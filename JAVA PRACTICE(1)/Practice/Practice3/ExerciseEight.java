import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;


        System.out.println("Test Data");
        System.out.println();

        System.out.println("Enter your first number: ");
        x = sc.nextInt();

        System.out.println("Enter your second number: ");
        y = sc.nextInt();

        System.out.println("Enter your third number: ");
        z = sc.nextInt();

        if ( x < y && x < z) {
            System.out.println("The smallest is " + x);
        } else if ( y < x && y < z ) {
            System.out.println("The smallest is " + y);
        } else if ( z < x && z < y ) {
            System.out.println("The smallest is " + z);
        }

        sc.close();
    }  
}
