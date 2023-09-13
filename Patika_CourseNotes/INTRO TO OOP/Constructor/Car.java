package Constructor;

public class Car {
    // Variables
    String type;
    String model;
    String color;
    int speed;

    // Parameterized constructor
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // Default constructor (constructor without parameters)
    public Car() {
        // You can provide default values here if needed
    }

    // Methods
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed - decrease >= 0)
            speed -= decrease;

        else
            speed = 0;

        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model : " + this.model);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Speed : " + this.speed);
    }
    
}