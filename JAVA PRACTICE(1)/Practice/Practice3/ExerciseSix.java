import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Enter your age: ");
        x = sc.nextInt();

        if ( x >= 18 ) {
            System.out.println("You are eligable");
        } else if ( x < 18 ) {
            System.out.println("Invalid");
        }

        sc.close();
    }
    
}
