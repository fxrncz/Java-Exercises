import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int minute, years, days;

        System.out.println("Input a value of minute: ");
        minute = sc.nextInt();

        years = (minute / 525600);
        days = (minute / 1440);

        System.out.println(minute + " minutes is approximately " + years + " years and " + days + " days");
        sc.close();
    }
}
