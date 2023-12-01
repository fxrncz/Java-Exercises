import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Put a number from 0 - 9");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println(x);
                break;
            case 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(x);
                break;
            case 4:
                System.out.println(x);
            case 5:
                System.out.println(x);
                break;
            case 6:
                System.out.println(x);
                break;
            case 7:
                System.out.println(x);
                break;
            case 8:
                System.out.println(x);
                break;
            case 9:
                System.out.println(x);
                break;
            default:
                System.out.println("Invalid");   
        }

        sc.close();
        
    }

    
}
