import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin am = new Admin();

        System.out.println("Enter admin account: ");
        System.out.println();

        System.out.println("Enter user: ");
        am.setUser(sc.nextLine());

        System.out.println("Enter password: ");
        am.setPass(sc.nextInt());

        switch (am.getUser()) {
            case "Admin":
                System.out.println();
                break;
            default:
                System.out.println("Invalid");
        }

        switch (am.getPass()) {
            case 123:
                System.out.println("Enter");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}