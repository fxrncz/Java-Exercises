import java.util.*;

public class _2Second {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int radius;

    System.out.println("Input a radius: ");
    radius = sc.nextInt();

    double area = Math.PI * (radius * radius);
    double perimeter = 2 * Math.PI * radius;

    System.out.println("The area of a circle is " + area);
    System.out.println("The perimeter of a circle is " + perimeter);
    
    sc.close();
  }
}
