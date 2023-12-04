public class Car {
    int speed = 100;
}

class FastCar extends Car {
    int speed = 200;

    FastCar(int a, int b) {
        super.speed = 100;
        speed = b;
    }
}