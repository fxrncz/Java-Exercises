import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, u, i;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input first number: ");
        x = sc.nextInt();

        System.out.println("Input second number: ");
        y = sc.nextInt();

        System.out.println("Input third number: ");
        u = sc.nextInt();

        System.out.println("Input fourth number: ");
        i = sc.nextInt();

     
        if ( x == y && x == u && x == i ) {  
            System.out.println("They are all equal");    
        } else {
            System.out.println("They are not equal");
        }
        sc.close();
    }
    
}
