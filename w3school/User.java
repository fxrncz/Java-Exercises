import java.util.Scanner;

public class User {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int grade;
        
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("This is the ratings of the grade.");
        System.out.println("90 - 100 = A");
        System.out.println("80 - 89 = B");
        System.out.println("75 - 79 = C");
        System.out.println("74 = D");
        System.out.println("73 = Fail");
        System.out.println();
        System.out.println("Enter your grade: ");
        grade = sc.nextInt();

        if ( grade >= 90 && grade == 100) {
            System.out.println("A");
        } else if ( grade >= 80 && grade <= 89 ) {
            System.out.println("B Congrats");
        } else if ( grade >= 75 && grade <= 79 ) {
            System.out.println("C");
        } else if ( grade == 74) {
            System.out.println("D");
        } else if ( grade == 73 ) {
            System.out.println("Fail");
        } else {
            System.out.println("You don't meet the expecation.");
        }
        sc.close();
    }
}
