import java.util.Scanner;

public class ExerciseSixth {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int y, u, i, o, t, sum;
       double avrg;

       System.out.println("Insert 5 numbers");

       System.out.println("First Number: ");
       y = sc.nextInt();

       System.out.println("Second Number: ");
       u = sc.nextInt();

       System.out.println("Third Number: ");
       i = sc.nextInt();

       System.out.println("Fourth Number: ");
       o = sc.nextInt();

       System.out.println("Fifth Number: ");
       t = sc.nextInt();

       sum = t + y + u + i + o;
       avrg = sum / 5; 

       sc.close();
       System.out.println("The sum of your choice number is " + sum + " and the average is " + avrg + " by five.");      
    }   
}
