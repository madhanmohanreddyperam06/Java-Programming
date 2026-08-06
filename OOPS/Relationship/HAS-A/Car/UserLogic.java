public class UserLogic{
    public static void main(String[] args) {
        Engine e1 = new Engine(1498, 250);
        Car c1 = new Car("TATA NEXON", 1850000, e1);
        c1.displayCar();
        System.out.println("========================================");
        c1.e.combustion();
        c1.ride();
    }
}