import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;


        System.out.println("Input a degree in Fahrenheit: ");
        x = sc.nextDouble();

        y = (( x - 32 ) * 5 /9);

        System.out.println(x + " degree Fahrenheit is equal to " + y + " in Celsius");
        sc.close();
    }
}
