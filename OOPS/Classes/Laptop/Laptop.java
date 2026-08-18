//constructor chaining

public class Laptop{
    String brand;
    double price;
    int ram;
    String color;
    int storage;
    public Laptop(String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    public Laptop(String brand, double price, int ram){
        this(brand,price);
        this.ram=ram;
    }
    public Laptop(String brand, double price, int ram, String color){
        this(brand,price,ram);
        this.color=color;
    }
    public Laptop(String brand, double price, int ram, String color, int storage){
        this(brand,price,ram,color);
        this.storage=storage;
    }
    public void getInfo(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>LAPTOP DETAILS<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Laptop Brand : " + this.brand);
        System.out.println("Laptop Price : " + this.price);
        System.out.println("Laptop RAM : " + this.ram);
        System.out.println("Laptop Color : " + this.color);
        System.out.println("Laptop Storage : " + this.storage);
    }
}