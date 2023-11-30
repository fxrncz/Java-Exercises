import java.util.Scanner;

public class MainTwo {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Shoes sh = new Shoes();

    System.out.println("Can i get your kinds of shoes");
    System.out.println();
    
    System.out.println("Your shoes name: ");
    sh.setBrand(sc.nextLine());
    System.out.println();
    System.out.println("So your brand of shoes is " + sh.getBrand());
    System.out.println();

    System.out.println("Your color of your shoes: ");
    sh.setColor(sc.nextLine());
    System.out.println();
    System.out.println("So the color of your brand is " + sh.getColor());
    System.out.println();

    System.out.println("Size of your shoes: ");
    sh.setSize(sc.nextInt());
    System.out.println();
    System.out.println("So the size of your shoes is " + sh.getSize());
    System.out.println();

    sc.close();
   }
}
