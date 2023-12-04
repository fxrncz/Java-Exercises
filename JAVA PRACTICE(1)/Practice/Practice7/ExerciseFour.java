import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;


        System.out.println("Test Data");
        System.out.println();

        System.out.println("What is the command keyword to exit a loop in java? ");
        System.out.println("A. int");
        System.out.println("B. continue");
        System.out.println("C. break");
        System.out.println("D. exit");
        ans = sc.nextLine();


        switch (ans) {
            case "C":
                System.out.println("Correct!");
                break;
            case "c":
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Wrong!");
        }
        sc.close();
    }
}
