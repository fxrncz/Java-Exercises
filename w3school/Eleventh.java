import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Guess a number if positive or negative");
        System.out.println();

        System.out.println("Enter a number: ");
        x = sc.nextInt();

        if ( x == 0 ) {
            System.out.println("Positive Zero");
        } else if ( x > 0 ) {
            System.out.println("Positive");
        } else if ( x < 0) {
            System.out.println("Negative");
        }
        sc.close();
    }
}

   
