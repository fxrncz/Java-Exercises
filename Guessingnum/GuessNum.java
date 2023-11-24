import java.io.*;
import java.util.*;
import java.util.InputMismatchException;

public class GuessNum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(50) + 1;
        File f = new File("Answers.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("===WELCOME===\n Guess the correct number!\n");

        while (true) {
            try {
                System.out.println("Input a number: ");
                int num = sc.nextInt();

                    if (num == randomNumber) {
                        System.out.println("You got the correct number!!!");
                        break;
                    } else if (num >= 1 && num < randomNumber) {
                        System.out.println("Too close");
                    } else if (num > randomNumber && num <= 10) {
                        System.out.println("Lower number");
                    } else if (num >= 11 && num <= 20) {
                        System.out.println("You're just going far, Lower");
                    } else if (num >= 21 && num <= 30) {
                        System.out.println("You're too far, Lower");
                    } else if (num >= 31 && num <= 41) {
                        System.out.println("Your number are high, Lower");
                    } else if (num >= 42 && num <= 50) {
                        System.out.println("Your number are too high, please lower!");
                    } else if (num > 50 && num <= 0) {
                        System.out.println("Out of range!");
                        System.out.println("Try again!");
                    }
                bw.write(String.valueOf(num++) + ", ");
                bw.flush();
            }
            catch (InputMismatchException e) {
                System.out.println("Letters are invalid");
                sc.next();
                continue;
            }
        }
        sc.close();
        bw.close();
    }
}
