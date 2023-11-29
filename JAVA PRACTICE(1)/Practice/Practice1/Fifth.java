import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, middleName, allName;
        int num1;
        double num2;

        System.out.println("Enter your First Name: ");
        firstName = sc.nextLine();

        System.out.println("Enter your Last Name: ");
        lastName = sc.nextLine();
        
        System.out.println("Enter your Middle Name: ");
        middleName = sc.nextLine();

        allName = lastName + firstName + middleName;
        System.out.println("So your name is " + allName);

        System.out.println("Enter your age: ");
        num1 = sc.nextInt();

        System.out.println("Enter your bday's date: ");
        num2 = sc.nextDouble();

        sc.close();
        System.out.println("So your name is " + allName + " and your age is " + num1 + " and your birthday is " + num2);
    }
}