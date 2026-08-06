class Engine {
    double cc;
    int torque;

    Engine(double cc, int torque) {
        this.cc = cc;
        this.torque = torque;
    }

    public void combustion() {
        System.out.println("Duu Duu Duu Duu...");
    }

    public void displayEngine() {
        System.out.println("Engine CC      : " + cc);
        System.out.println("Engine Torque  : " + torque + " Nm");
    }
}

class Car {
    String brand;
    double price;
    Engine e;

    Car(String brand, double price, Engine e) {
        this.brand = brand;
        this.price = price;
        this.e = e;
    }

    public void ride() {
        System.out.println("Enjoy the ride with your______________");
    }

    public void displayCar() {
        System.out.println("=========CAR & ENGINE DETAILS===========");
        System.out.println("Car Brand      : " + brand);
        System.out.println("Car Price      : " + price);
        e.displayEngine();
    }
}