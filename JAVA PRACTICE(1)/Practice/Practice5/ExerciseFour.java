import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthNumber, sum, rem, num;

        System.out.println("Input a number between 0 - 10000: ");
        num = sc.nextInt();

        firstDigit = num % 10;
        rem = num / 10;
        secondDigit = rem % 10;
        rem = rem / 10;
        thirdDigit = rem % 10;
        rem = rem / 10;
        fourthDigit = rem % 10;
        rem = rem / 10;
        fifthNumber = rem % 10;
        sum = thirdDigit + secondDigit + firstDigit + fourthDigit + fifthNumber;

        System.out.println("The sum of all digits in " + num + " is " + sum);
        sc.close();
    }
}
