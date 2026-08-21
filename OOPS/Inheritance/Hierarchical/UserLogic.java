public class UserLogic{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();
        System.out.println("===========================================================");
        c.eat();
        c.meow();
    }
}