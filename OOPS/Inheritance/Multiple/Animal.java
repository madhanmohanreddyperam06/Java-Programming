// Multiple Inheritance --> single child class acquires properties and methods from a multiple parent classes

interface Animal{
    public void eat();
}
interface Pet{
    public void play();
}
class Dog implements Animal,Pet{
    public void eat(){
        System.out.println("Dog Eats");
    }
    public void play(){
        System.out.println("Dog Plays");
    }
    public void bark(){
        System.out.println("Dog Barks");
    }
}