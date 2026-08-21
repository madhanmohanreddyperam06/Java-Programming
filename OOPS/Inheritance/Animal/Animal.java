// Inheritance 
//--> It is one of the main pillar in OOPS
//--> The process of acquiring properties and methods from one class to another class is known as Inheritance
//--> for example, a child class is acquiring properties and methods from parent class i.e, Inheritance

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

