import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.println("Input a number: ");
        num = sc.nextInt();

        for ( int x = 1; x <= num; x++) {
            sum = sum + num;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }  
}
