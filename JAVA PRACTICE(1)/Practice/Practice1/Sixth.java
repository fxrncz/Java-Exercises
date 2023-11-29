import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Put your grade: ");
        x = sc.nextInt();

        if( x >= 90 && x <= 100 ) {
            System.out.println("Congrats, you got A!");
        } else if ( x >= 80 && x < 90 ) {
            System.out.println("Nice, you got B!");
        } else if ( x >= 70 && x < 80 ) {
            System.out.println("Better luck next time, you got C");
        } else if ( x >= 60 && x < 70 ) {
            System.out.println("You should study more, you got D");
        }       
    }   
}
