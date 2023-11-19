import java.util.*;

public class _6Sixth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Input a number: ");
    num = sc.nextInt();

    for (int x = 0; x <= num; x = x+10) {
      System.out.println(x);
    }

    sc.close();
  }
}
