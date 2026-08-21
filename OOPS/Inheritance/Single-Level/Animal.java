//Single Inheritance --> a single child class acquires properties and methods from it's parent class

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