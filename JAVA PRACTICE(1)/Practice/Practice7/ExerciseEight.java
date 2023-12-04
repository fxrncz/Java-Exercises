import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Input an integer: ");
        x = sc.nextInt();

        System.out.println(Math.abs(x));

        sc.close();
    }
}
