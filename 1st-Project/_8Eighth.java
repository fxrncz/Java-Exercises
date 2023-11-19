import java.util.*;

public class _8Eighth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Input a number: ");
    num = sc.nextInt();

    System.out.println("\nMultiplication table of " + num);

    for (int x = 0; x <= 5; x++) {
      System.out.println(x + " x " + num + " = " + (x*num));
    }
    sc.close();
  }
}
