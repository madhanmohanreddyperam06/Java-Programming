public class Bike{
    String brand;
    double price;
    public Bike(String brand, double price){
        super();
        this.brand = brand;
        this.price = price;
    }
    public String toString(){
        return "Bike [brand=" + brand + ", price = " + price + ")";
    }
}