// Run Time Polymorphism --> it is achieved from method overriding

class Animal{
    void sound(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}