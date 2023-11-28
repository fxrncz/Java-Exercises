import java.util.Scanner;

public class ExerciseFive {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, sum;
        
        System.out.println("Enter your First Number: ");
        firstNumber = sc.nextInt();

        System.out.println("Enter your Second Number: ");
        secondNumber = sc.nextInt();

        sum = firstNumber + secondNumber;
        System.out.println("The sum is " + sum);
    }
}
