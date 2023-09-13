package ClassAndObject;

// ? OOP Properties
// ? OOP is a fast and easy-to-implement approach.
// ? OOP provides a clear structure for programs.
// ? OOP implements the principle of "Don't Repeat Yourself" and makes code easier to maintain, edit, and debug.
// ? OOP makes it possible to create reusable applications with less code and shorter development time.
// ? OOP provides extensibility by adding new features to the structure later.
// ? OOP models problems based on real-life processes.



// Define a class named "Car"
class Car {
    // Instance variables (attributes)
    String make;
    String model;
    int year;
    double price;

    // Constructor method
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }


}
