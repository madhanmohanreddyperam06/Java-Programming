// UpCasting and DownCasting

public class Animal{
    void eat(){
    System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bar(){
    System.out.println("Dog barks");
}
}
class Puppy extends Dog{
    void play(){
    System.out.println("Puppy plays");
}
}