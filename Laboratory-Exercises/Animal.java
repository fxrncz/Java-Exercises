package pkg07handsonactivity1;

public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

class Bird extends Animal{
    public void eat() {
        System.out.print("Birds love to eat seeds");
    }
    
    public void sleep() {
        System.out.print(" and sleep for 10 - 12 hours a day.");
    }
    
    public void makeSound() {
        System.out.println("\nTweet-tweet");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.print("Dog love to eat meat");
    }
    
    public void sleep() {
        System.out.print(" and sleep for 5 - 7 hours a day.");
    }
    
    public void makeSound() {
        System.out.println("\nArf-arf");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.print("Cat love to eat fish");
    }
    
    public void sleep() {
        System.out.print(" and sleep for 10 - 12 hours a day.");
    }
    
    public void makeSound() {
        System.out.println("\nMeow-meow");
    }
}


