import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person pr = new Person();

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Enter your name: ");
        pr.setName(sc.nextLine());

        System.out.println("Enter your age: ");
        pr.setAge(sc.nextInt());
        
        System.out.println("Enter your height: ");
        pr.setHeight(sc.nextInt());

        System.out.println("Enter mathematical pie: ");
        pr.setPie(sc.nextDouble());

        System.out.println();

        System.out.println("Your name is " + pr.getName());
        System.out.println("Your age is " + pr.getAge());
        System.out.println("Your height is " + pr.getHeight());
        System.out.println("The mathematical pie is " + pr.getPie());

        sc.close();
    }
}
