import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        int pass;

        System.out.println("Enter your username: ");
        user = sc.nextLine();

        System.out.println();

        System.out.println("Your password must contain of numbers only.");
        System.out.println("Enter your password: ");
        pass = sc.nextInt();

        System.out.println();

        System.out.println(user);
        System.out.println(pass);

        sc.close();
    }    
}
