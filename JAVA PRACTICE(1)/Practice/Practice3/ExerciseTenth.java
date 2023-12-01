import java.util.Scanner;

public class ExerciseTenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Keyboard kb = new Keyboard();

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Enter brand of keyboard: ");
        kb.setBrand(sc.nextLine());

        System.out.println("Your brand is " + kb.getBrand());
        System.out.println();

        System.out.println("Enter the exact number of keys in keyboard: ");
        kb.setKeys(sc.nextInt());

        switch (kb.getKeys()) {
            case 105:
                System.out.println("You got the correct number of keys which is " + kb.getKeys());
                break;
            default:
                System.out.println("Try again");
        }

        System.out.println("Enter the exact number of numeric keys in keyboard: ");
        kb.setNumeric(sc.nextInt());

        switch (kb.getNumeric()) {     
            case 17:
                System.out.println("You got the exact number and that is " + kb.getNumeric());
                break;
            default:
                System.out.println("Try again");
        }
        sc.close();
    }
}