public class Mobile{
        String brand;
        double price;
        int storage;
        int ram;
    public Mobile(String brand, double price, int storage, int ram){
        this.brand = brand;
        this.price=price;
        this.storage=storage;
        this.ram=ram;
    }
    public void getInfo(){
        System.out.println(">>>>>>>>>>>>>>Mobile Details<<<<<<<<<<<<<<<<");
        System.out.println("Mobile brand is : " + this.brand);
        System.out.println("Mobile price is : " + this.price);
        System.out.println("Mobile storage is : " + this.storage);
        System.out.println("Mobile RAM is : " + this.ram);
    }
}