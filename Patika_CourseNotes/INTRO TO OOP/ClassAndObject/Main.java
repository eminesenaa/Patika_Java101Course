package ClassAndObject;

public class Main {
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota", "Camry", 2022, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2021, 22000.0);

        // Call the displayInfo method for each car
        System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();
    }
}
