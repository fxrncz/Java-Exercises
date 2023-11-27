import java.util.Scanner;

public class Whole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String greet = "Hello";
        String name = "Francis Oliver";
        
        System.out.println("Number 1: ");
        System.out.println();
        System.out.println(greet);
        System.out.println(name);
        System.out.println();

        int x, y, res;
        x = 74 + 36;
        y = 50 / 3;
        res = y % 3;

        System.out.println("Number 2: ");
        System.out.println();
        System.out.println(x);
        System.out.println(y + " and the remainder is " + res);
        System.out.println();

        int a, b, c, d;
        a = -5 + 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + 3 * 5 / 8;
        d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Number 3: ");
        System.out.println();
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
        System.out.println("D. " + d);
        System.out.println();

        int i, o, pro;

        System.out.println("Number 4: ");
        System.out.println("Test Data: ");
        System.out.println();

        System.out.println("Inpute first number: ");
        i = sc.nextInt();

        System.out.println("Input second number: ");
        o = sc.nextInt();

        pro = i * o;

        System.out.println(i + " x " + o + " = " + pro);
        System.out.println();

        int t, r;
        
        System.out.println("Number 5: ");
        System.out.println();
        
        System.out.println("Input first number: ");
        t = sc.nextInt();

        System.out.println("Input second number: ");
        r = sc.nextInt();

        System.out.println(t + " + " + r + " = " + (t+r));
        System.out.println(t + " - " + r + " = " + (t-r));
        System.out.println(t + " x " + r + " = " + (t*r));
        System.out.println(t + " / " + r + " = " + (t/r));
        System.out.println();

        double m, l, radius;
        
        System.out.println("Number 6: ");
        System.out.println();

        System.out.println("Inser radius: ");
        radius = sc.nextInt();

        m = (3.14 *(radius) * radius );
        l = (2 *(Math.PI) * radius );

        System.out.println("The area is " + m);
        System.out.println("The perimeter is " + l);
        sc.close();
    }
}