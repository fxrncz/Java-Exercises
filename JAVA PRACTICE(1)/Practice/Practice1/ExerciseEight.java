import java.util.Scanner;

public class ExerciseEight {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x;

      System.out.println("Enter a number that will say Maximum range 0 - 20: ");
      x = sc.nextInt();

      if ( x == 20 ) {
          System.out.println("Maximum = " + x);
      } else if ( x >= 16 && x < 19) {
          System.out.println("Close!");
      } else if ( x >= 10 && x < 16) {
          System.out.println("More!");
      } else if ( x >= 5 && x < 10 ) {
          System.out.println("Too little.");
      } else if ( x >= 0 && x < 5) {
          System.out.println("Too far.");
      }
    }
}
