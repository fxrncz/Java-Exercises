import java.util.Scanner;

public class Fahrenheit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Enter a value: ");
        celsius = sc.nextDouble();

        fahrenheit = ((9 / 5) * celsius + 32.0);
        
        sc.close();
        System.out.println("The value is " + fahrenheit + "  when you convert it to " + celsius );
    }
}
