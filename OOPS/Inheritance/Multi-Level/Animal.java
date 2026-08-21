// Multi-Level Inheritance --> a child class acquires properties and methods from it's parent class and then that parent class acquires properties and methods from it's parent class

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
class Puppy extends Dog{
    static void play(){
        System.out.println("Puppy Plays");
    }
}