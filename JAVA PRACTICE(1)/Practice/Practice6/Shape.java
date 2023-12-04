public class Shape {
    private int length;
    private int breadth;

    Shape() {
    }

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = length; 
    } 
}

class Cuboids extends Shape {
    private int height;

    Cuboids(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
}