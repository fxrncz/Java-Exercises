import java.util.*;

public class _7Seventh {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Input a number: ");
    num = sc.nextInt();

    System.out.println("Multiplication table of " + num);

    for(int x = 0; x <= 10; x++) {
      System.out.println(num + " x " + x + " = " + (num*x));
    }

    sc.close();
  }
}
