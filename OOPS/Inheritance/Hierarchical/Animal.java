// Hierarchical Inheritance --> multiple child classes acquires properties and methods from a single parent class

class Animal{
    static void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    static void bark(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    static void meow(){
        System.out.println("Cat Meows");
    }
}