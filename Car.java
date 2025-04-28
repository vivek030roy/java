class Car {
    String brand;
    String model;

    // Constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
    }

    public static void main(String[] args) {
        // Creating an object using the constructor
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayInfo();
    }
}