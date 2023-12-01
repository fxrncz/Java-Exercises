import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x=10;");
        System.out.println("b. int x=10;");
        System.out.println("c. float x=10.0f;");
        System.out.println("d. string x=10;");
        System.out.println();

        System.out.println("Enter your answer: ");
        b = sc.nextLine();

        switch (b) {
            case "b":
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Wrong!");
        }

        sc.close();
        
    }
    
}
