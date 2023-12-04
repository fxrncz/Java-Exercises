import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin ad = new Admin();

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input admin user: ");
        ad.setUser(sc.nextLine());

        System.out.println("Input admin pass: ");
        ad.setPass(sc.nextInt());


        switch (ad.getUser()) {
            case "Francis":
                System.out.println();
                break;
            default:
                System.out.println("Invalid");
        }

        switch (ad.getPass()) {
            case 12345:
                System.out.println("Enter");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}