import java.util.*;

public class _2Second {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("Input first number: ");
    num1 = sc.nextInt();

    System.out.println("Input second number: ");
    num2 = sc.nextInt();

    System.out.println("Input third number: ");
    num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println("Greatest is " + num1);
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("Greatest is " + num2);
    } else if (num3 > num1 && num3 > num2) {
      System.out.println("Greatest is " + num3);
    }
    
    sc.close();
  }
}
