import java.util.Scanner;

public class ExerciseSeven {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double fahrenheit, celsius;

    System.out.println("Insert value: ");
    celsius = sc.nextInt();

    fahrenheit = ((celsius * 9 / 5) + 32.0);

    sc.close();
    System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}
