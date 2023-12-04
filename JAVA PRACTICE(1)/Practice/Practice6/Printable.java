interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of a rectangle is " + (length * breadth));
    }
} 

class Classer {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(5, 6);
    }
}
