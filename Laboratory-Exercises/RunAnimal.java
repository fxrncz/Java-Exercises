package pkg07handsonactivity1;

import java.util.*;

public class RunAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bird b = new Bird();
        Dog d = new Dog();
        Cat c = new Cat();
        
        System.out.println("Choose an animal");
        System.out.println("Press 'B' for Bird");
        System.out.println("Press 'C' for Cat");
        System.out.println("Press 'D' for Dog");
        System.out.print("ENTER: ");
        String con = sc.nextLine().toUpperCase();
        
        if (con.matches("B")) {
            b.eat();
            b.sleep();
            b.makeSound();
        } else if (con.matches("C")) {
            c.eat();
            c.sleep();
            c.makeSound();
        } else if (con.matches("D")) {
            d.eat();
            d.sleep();
            d.makeSound();
        } else {
            System.out.println("Invalid Letter!");
        }
    }
}


