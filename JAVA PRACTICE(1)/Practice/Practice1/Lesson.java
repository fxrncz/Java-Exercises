import java.util.Scanner;

public class Lesson {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String y;

        System.out.println("Welcome to my Guessing game");
        System.out.println("Type Yes to start!");
        y = sc.nextLine();

        System.out.println("Let's start");
        System.out.println("Here is your First Question");
        System.out.println();

        System.out.println("What is my name? ");
        System.out.println("1. Francis Oliver");
        System.out.println("2. Marcus Almendares");
        num1 = sc.nextInt();

        if (num1 == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Better Luck next time!");
        }
 
        System.out.println("Let's proceed to the second question");
        System.out.println();

        System.out.println("Here is your second question");
        System.out.println("Who is the one who taught me the programming?");
        System.out.println("1. Tristan Unabia");
        System.out.println("2. Charry Jusi");
        System.out.println("3. Patrick Llabres");
        num2 = sc.nextInt();

        if (num2 == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("You are wrong again!");
        }



    }
    
}
