import java.util.*;

public class _3Third {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Input a number: ");
    num = sc.nextInt();

    if (num == 0) {
      System.out.println("Zero");
    } else if (num > 0 && num <= 1000000) {
      System.out.println("Positive number");
    } else if (num < 1) {
      System.out.println("Negative number\nSmall");
    } else if (num > 1000000) {
      System.out.println("Large");
    }

    sc.close();
  }
}
