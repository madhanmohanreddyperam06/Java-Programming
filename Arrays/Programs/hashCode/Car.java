// hashCode()

public class Car{
    String brand;
    String color;
    double price;
    int mileage;
    public Car(String brand, String color, double price, int mileage){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.mileage=mileage;
    }
    public String toString(){
        return "Brand = " + brand + ", Color = " + color + ", Price = " + price + ", Mileage = " + mileage;
    }
    public boolean equals(Object o){
        Car c = (Car) o;
        return this.brand==c.brand && this.color==c.color && this.price==c.price && this.mileage==c.mileage;
    }
    public int hashCode(){
        return brand.hashCode()%1000000000+ color.hashCode()%1000000000 + ((Double)price).hashCode()%1000000000 + mileage;
    }
}