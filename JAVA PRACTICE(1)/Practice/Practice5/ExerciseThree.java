import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch, meters;

        System.out.println("Input a value for inch");
        inch = sc.nextDouble();

        meters = (inch / 39.37);

        System.out.println(inch + " inch is " + meters + " meters");
        sc.close();
    }
}
