import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int correctNum = 10;
     
        while (true) {
           
            System.out.println("Guess a number between 0 to 50: ");
            guess = sc.nextInt();

            if (guess == correctNum) {
                System.out.println("Correct");
                break;
            } else if (guess > correctNum) {
                System.out.println("Lower");
            } else if (guess < correctNum) {
                System.out.println("Higher");
            }
        }

        sc.close();

    }      
}