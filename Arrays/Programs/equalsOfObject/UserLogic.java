public class UserLogic{
    public static void main(String[] args){
        Car c1 = new Car("Audi", "White", 300000, 8);
        Car c2 = new Car("Benz", "Blue", 500000, 7);
        Car c3 = new Car("Audi", "White", 300000, 8);

        System.out.println(c1==c2); //false
        System.out.println(c1==c3); //true

        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equals(c3)); //true
    }
}