import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.util.*;

public class GuessingNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("CorrectAnswer.txt");
        System.out.println(f.exists());
        FileWriter fileW = new FileWriter(f);
        BufferedWriter bufferW = new BufferedWriter(fileW);
        bufferW.write("Your guess numbers: ");
        bufferW.newLine();
        bufferW.write(54);
        bufferW.flush();
        bufferW.close();

        System.out.println("===WELCOME===\n");
        System.out.println("Guess the number correctly.");

        while (true) {
            System.out.println("Input a number: ");
            int x = sc.nextInt();

                if (x == 6) {
                    System.out.println("You got the correct number!");
                    break;
                } else if (x <= 6) {
                    System.out.println("Higher");
                } else if (x >= 6) {
                    System.out.println("Lower");
                }
        }
        sc.close();
    }
}