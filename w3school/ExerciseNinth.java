import java.util.Scanner;

public class ExerciseNinth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Let's determine if your chosen number is negative or positive");
        System.out.println();
        System.out.println("Enter a number: ");
        x = sc.nextInt();

        if ( x == 0 ) {
            System.out.println("Positive zero");
        } else if ( x >= 0 ) {
            System.out.println("Positive");
        } else if ( x <= 0 ) {
            System.out.println("Negative");
        }
        
        sc.close();
    }
}
