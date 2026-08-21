// compile time polymorphism --> we can achieve compile time polymorphism using method overloading mechanism

public class Calculator{
    //int a;
    //int b;
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
}