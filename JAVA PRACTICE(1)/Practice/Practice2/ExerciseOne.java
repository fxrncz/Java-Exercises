import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, res, rem;

        System.out.println("Enter a number and we will add and multiply by 2");
        System.out.println("then we will determine if it's positive or negative");
        System.out.println("and even or odd");
        System.out.println();

        System.out.println("First number: ");
        num1 = sc.nextInt();

        System.out.println("Second number: ");
        num2 = sc.nextInt();

        res = ( num1 + num2 ) / 2;
        rem = res % 5;

        if ( res%2 == 0 ) {
            System.out.println("Positive and even");
        } else if ( res < 0)  {
            System.out.println("Negative");
        } else {
            System.out.println("Positive and odd " + res  + " and the remainder is " + rem);
        }
        
        sc.close();
    }
    
}
