public class Exercise {
    public static void main(String[] args) {
        double x, y;
        boolean z, c, r, t;

        x = (101 + 0) / 3;
        y = (3.0e-6 * 10000000.1 );
        
        z = (true && true);
        c = (false && true);
        r = ((false && false) || (true && true));
        t = (false || false) && (true && true);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}