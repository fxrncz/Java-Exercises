import java.util.Scanner; 

public class UserOne {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;
        int num1;

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("The following question is about Ange");
        System.out.println();
        System.out.println("First Question: ");
        System.out.println("How tall is ange ");
        height = sc.nextDouble();

        if ( height == 5 ) {
            System.out.println("You got the correct height!");
        } else if ( height <= 5.9 && height >= 5.1) {
            System.out.println("Too high");
        } else if ( height <= 4.5 && height == 4.12 ) {
            System.out.println("Too short but too close");
        } else {
            System.out.println("Hehe");
        }

        System.out.println();
        System.out.println("Question about Marcus: ");
        System.out.println("Tangina, sino pumlastik kay cus?");
        System.out.println();
        System.out.println("1. Hakdog Malaki Ange");
        System.out.println("2. Bobo si christian");
        System.out.println("3. Ralph Malapok");
        num1 = sc.nextInt();

        if ( num1 == 1 ) {
            System.out.println("You got the correct answer");
        } else {
            System.out.println("EEEEEEEEEEEEENGK");
        }
        sc.close();
        
    }
}
