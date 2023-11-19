import java.util.*;

public class _1First {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;

    System.out.println("Input a number: ");
    num1 = sc.nextInt();

      if (num1 >= 0 ) {
        System.out.println("Positive");
      } else if (num1 < 0) {
          System.out.println("Negative");
      }
      sc.close();
  }
}