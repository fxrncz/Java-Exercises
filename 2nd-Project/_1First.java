import java.util.*;

public class _1First {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int width, height;

    System.out.println("Input a height: ");
    height = sc.nextInt();

    System.out.println("Input a width: ");
    width = sc.nextInt();

    int area = (height * width);
    int perimeter = 2 * (width + height);

    System.out.println("The area is " + area);
    System.out.println("The perimeter is " + perimeter);
    
    sc.close();
  }
}