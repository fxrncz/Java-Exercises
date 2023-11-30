import java.util.Scanner;

public class MainThree{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reji rj = new Reji();

        System.out.println("Enter a fucking a reji");
        System.out.println();

        System.out.print("Enter a name: ");
        rj.setName(sc.nextLine());

        System.out.println("Enter a age: ");
        rj.setAge(sc.nextDouble());

        System.out.println("Enter his height: ");
        rj.setHeight(sc.nextDouble());

        System.out.println();

        System.out.println("His name is " + rj.getName());
        System.out.println("His age is " + rj.getAge());
        System.out.println("His height " + rj.getHeight());

        sc.close();
    }
}