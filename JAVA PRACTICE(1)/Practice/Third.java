import java.util.Scanner;

class Third {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       System.out.println("Enter: ");
       String name = sc.nextLine();

       System.out.println("So your name is " + name + " " + "and how old are you?");
       int age = sc.nextInt();

       System.out.println("Okay, so your age is " + age);
    }  
}
