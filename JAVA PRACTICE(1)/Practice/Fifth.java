import java.util.Scanner;

public class Fifth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1;
    int fact = 1;
    int i, x;

    System.out.print("Enter positive numbers: ");
    n1 = sc.nextInt();

    
    if (n1 > 0) {
      for (x = 1; x <= n1; x++) {
        System.out.println(x + " x ");
        fact = fact * 1;
      }
        System.out.println("The factorial of " + n1 + " is: " + fact);
    } else if (n1 < 0) {
          System.out.println("Invalid Input! Program Stopped!");
    } else {
      System.out.println("The number you entered is zero.");
    }
  }
}
