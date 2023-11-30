import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Person pn = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's determine your Race: ");
        System.out.println();

        System.out.println("Enter your name: ");
        pn.setName(sc.nextLine());

        System.out.println("Enter your personality: ");
        pn.setPersonality(sc.nextLine());

        System.out.println("Enter your race: ");
        pn.setRace(sc.nextLine());

        System.out.println("So your name is " + pn.getName());
        System.out.println("Your race is " + pn.getRace());
        System.out.println("Your personality is " + pn.getPersonality());

        sc.close();
    }
}
