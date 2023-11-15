import java.util.*;

public class _5Fifth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num1, num2;

    System.out.println("Input a first floating number: ");
    num1 = sc.nextFloat();

    System.out.println("Input a second floating number: ");
    num2 = sc.nextFloat();

    if (num1 == num2 && num2 == num1) {
      System.out.println("They are the same");
    } else {
      System.out.println("They are not the same");
    }

    sc.close();
  }
}
